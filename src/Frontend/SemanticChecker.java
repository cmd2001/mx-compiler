package Frontend;

import AST.*;
import Util.*;

import java.util.Stack;

public class SemanticChecker implements ASTVisitor {
    Stack<ControlFlow> controlFlowStack = new Stack<>();
    Stack<Type> expectedReturnTypeStack = new Stack<>();
    Stack<Boolean> hasReturnedStack = new Stack<>();
    Stack<Scope> scopeStack = new Stack<>();
    Stack<String> currentClassStack = new Stack<>();
    GlobalScope gScope = new GlobalScope();

    @Override
    public void visit(ASTNode it) { throw new internalError("visit ASTNode should be never used", new position(0, 0)); }

    @Override
    public void visit(ProgramNode it) {
        // solve definition
        for(CompoundStatementNode x: it.compoundStatements) if(x.isClassDefStatement) {
            String className = x.classDefNode.className;
            if(!gScope.checkClassName(className)) throw new syntaxError("Class name same to a class/function/variable", x.pos());
            gScope.addType(className, new ClassType(className, gScope), x.pos());
        }
        for(CompoundStatementNode x: it.compoundStatements) if(x.isFuncDefStatement) {
            String funcName = x.functionDefNode.funcName;
            if(!gScope.checkFunctionName(funcName)) throw new syntaxError("Function name same to a class/function", x.pos());
            gScope.defineFunction(new FunctionType(x.functionDefNode, false), x.pos());
        }
        // push stack
        controlFlowStack.push(ControlFlow.GLOBAL);
        scopeStack.push(gScope);
        // visit compoundStatements
        for(CompoundStatementNode x: it.compoundStatements) visit(x);

        // check main
        if(!gScope.hasFunction("main", false)) throw new syntaxError("main function not found", new position(0, 0));
        if(!gScope.getFunction("main", false).returnType.equals(gScope.getIntType())) throw new syntaxError("invalid main function", new position(0, 0));
    }

    @Override
    public void visit(CompoundStatementNode it) {
        if(it.isFuncDefStatement) visit(it.functionDefNode);
        if(it.isClassDefStatement) visit(it.classDefNode);
        if(it.isVarDefStatement) visit(it.varDefStatementNode);
    }

    @Override
    public void visit(FunctionDefNode it) {
        // create scope and push stack
        Scope newScope = new Scope(scopeStack.peek());
        scopeStack.push(newScope);
        controlFlowStack.push(ControlFlow.FUNC);

        // check arguments and return type
        assert (it.argTypes.size() == it.argNames.size());
        for(int i = 0; i < it.argTypes.size(); i++) {
            if(gScope.hasType(it.argNames.get(i))) throw new syntaxError("Argument name same to a Class", it.pos()); // fixme: is this necessary?
            Type type = new TypeBuilder().build(it.argTypes.get(i));
            if(!(type instanceof ArrayType) && !gScope.hasType(type.toString())) throw new syntaxError("Invalid argument type " + type.toString(), it.pos());
            newScope.defineVariable(new Variable(type, it.argNames.get(i)), it.pos());
        }
        hasReturnedStack.push(false);
        if(!it.isVoid) {
            Type returnType = new TypeBuilder().build(it.returnType);
            if (!(returnType instanceof ArrayType) && !gScope.hasType(returnType.toString())) throw new syntaxError("Invalid return type " + returnType.toString(), it.pos());
            expectedReturnTypeStack.push(returnType);
        } else expectedReturnTypeStack.push(gScope.getVoidType());

        // visit function body
        visit(it.funcBody);
        if(!it.funcName.equals("main") && !it.isVoid && !hasReturnedStack.peek()) throw new syntaxError("No return value in non-void function", it.pos());

        // pop stack
        scopeStack.pop();
        controlFlowStack.pop();
        expectedReturnTypeStack.pop();
        hasReturnedStack.pop();
    }

    @Override
    public void visit(StatementNode it) {
        if(it.isIf) visit(it.ifNode);
        if(it.isFor) visit(it.forNode);
        if(it.isWhile) visit(it.whileNode);
        if(it.isSimpleStatement) visit(it.simpleStatement);
        if(it.isBlock) visit(it.blockNode);
    }

    @Override
    public void visit(ClassDefNode it) {
        // create scope and push stack
        Scope newScope = new Scope(scopeStack.peek());
        ((ClassType) gScope.getType(it.className)).localScope = newScope;
        scopeStack.push(newScope);
        controlFlowStack.push(ControlFlow.CLASS);
        currentClassStack.push(it.className);

        // check definition
        for(VarDefStatementNode x: it.variables) {
            Type type = new TypeBuilder().build(x.type);
            if(!(type instanceof ArrayType) && !gScope.hasType(type.toString())) throw new syntaxError("Invalid type " + type.toString(), x.pos());
            for(VarDefNode v: x.variables) {
                if(v.expression != null) throw new syntaxError("Assigning value when defining variable in class is INVALID", it.pos());
                if(newScope.hasVariable(v.variableName, false)) throw new syntaxError("Variable defined twice in Class", it.pos());
                newScope.defineVariable(new Variable(type, v.variableName), v.pos());
            }
        }
        for(FunctionDefNode x: it.functions) {
            if(newScope.hasFunction(x.funcName, false)) throw new syntaxError("Function defined twice in Class" , x.pos());
            if(gScope.hasType(x.funcName))  throw new syntaxError("Function name same to a Type" , x.pos());
            if(x.funcName.equals(it.className)) throw new syntaxError("Invalid construction function", x.pos());
            // no need to check arguments type and name, this will be done when visiting function.
            newScope.defineFunction(new FunctionType(x, false), x.pos());
        }
        for(ConstructFunctionDefNode t: it.constructFunctions) {
            newScope.defineConstructor(new FunctionType(it.className, gScope.getVoidType()), t.pos());
        }

        // check functions
        for(FunctionDefNode x: it.functions) visit(x);
        for(ConstructFunctionDefNode x: it.constructFunctions) visit(x);

        // pop stack
        scopeStack.pop();
        controlFlowStack.pop();
        currentClassStack.pop();
    }

    @Override
    public void visit(ConstructFunctionDefNode it) {
        // create scope and push stack
        Scope newScope = new Scope(scopeStack.peek());
        scopeStack.push(newScope);
        controlFlowStack.push(ControlFlow.FUNC);
        expectedReturnTypeStack.push(gScope.getVoidType());

        // visit body
        visit(it.block);

        // pop stack
        scopeStack.pop();
        controlFlowStack.pop();
        expectedReturnTypeStack.pop();
    }

    @Override
    public void visit(SimpleStatementNode it) {
        if(it.isVarDefStatement) {
            visit(it.varDefStatement);
        } else if(it.isReturn) {
            for(int i = controlFlowStack.size() - 1; i >= 0; i--) { // ignore FOR and WHILE
                if(controlFlowStack.get(i) == ControlFlow.FUNC) break; // return in a function.
                if(controlFlowStack.get(i) == ControlFlow.CLASS || controlFlowStack.get(i) == ControlFlow.GLOBAL) throw new syntaxError("A return out of function", it.pos());
            }
            if(it.expression != null) {
                visit(it.expression);
                if(!it.expression.valueType.equals(expectedReturnTypeStack.peek())) throw new syntaxError("Incorrect return type", it.pos());
                hasReturnedStack.pop();
                hasReturnedStack.push(true);
            } else if(!expectedReturnTypeStack.peek().equals(gScope.getVoidType())) throw new syntaxError("Incorrect return type", it.pos());
        } else if(it.isBreak) {
            if(controlFlowStack.peek() != ControlFlow.FOR && controlFlowStack.peek() != ControlFlow.WHILE) throw new syntaxError("Break out of a loop", it.pos());
        } else if(it.isContinue) {
            if(controlFlowStack.peek() != ControlFlow.FOR && controlFlowStack.peek() != ControlFlow.WHILE) throw new syntaxError("Break out of a loop", it.pos());
        } else if(it.isExpression) {
            visit(it.expression);
        }
    }

    @Override
    public void visit(VarDefStatementNode it) {
        Type type = new TypeBuilder().build(it.type);
        if(!(type instanceof ArrayType) && !gScope.hasType(type.toString())) throw new syntaxError("Invalid variable type " + type.toString(), it.pos());
        if(!(type instanceof ArrayType)) type = gScope.getType(type.toString());
        for(VarDefNode t: it.variables) {
            if(t.expression != null) visit(t.expression);
            // if(type instanceof ClassType) ((ClassType) type).printFunctions();
            scopeStack.peek().defineVariable(new Variable(type, t.variableName), t.pos());
        }
    }

    @Override
    public void visit(ExpressionNode it) {
        switch (it.expressionType) {
            case Postfix -> {
                visit(it.postfixExpressionNode);
                it.valueType = it.postfixExpressionNode.valueType;
            }
            case New -> {
                visit(it.newExpressionNode);
                it.valueType = it.newExpressionNode.valueType;
            }
            case Member -> {
                visit(it.memberExpressionNode);
                it.valueType = it.memberExpressionNode.valueType;
            }
            case FunCall -> {
                visit(it.funcCallExpressionNode);
                it.valueType = it.funcCallExpressionNode.valueType;
            }
            case Subscript -> {
                visit(it.subscriptExpressionNode);
                it.valueType = it.subscriptExpressionNode.valueType;
            }
            case Prefix -> {
                visit(it.prefixExpressionNode);
                it.valueType = it.prefixExpressionNode.valueType;
            }
            case Binary -> {
                visit(it.binaryExpressionNode);
                it.valueType = it.binaryExpressionNode.valueType;
            }
            case Sub -> {
                visit(it.subExpressionNode);
                it.valueType = it.subExpressionNode.valueType;
            }
            case This -> {
                visit(it.thisExpressionNode);
                it.valueType = it.thisExpressionNode.valueType;
            }
            case Const -> {
                visit(it.constExpressionNode);
                it.valueType = it.constExpressionNode.valueType;
            }
            case Id -> {
                visit(it.idExpressionNode);
                it.valueType = it.idExpressionNode.valueType;
            }
        }
    }

    @Override
    public void visit(BlockNode it) { // always create scope when visit block: "{...}".
        scopeStack.push(new Scope(scopeStack.peek()));
        for(StatementNode x: it.statements) visit(x);
        scopeStack.pop();
    }

    @Override
    public void visit(IfNode it) {
        visit(it.expression);
        if(!it.expression.valueType.equals(gScope.getBoolType())) throw new syntaxError("If condition is not boolean", it.expression.pos());

        scopeStack.push(new Scope(scopeStack.peek()));
        visit(it.ifStatement);
        scopeStack.pop();

        if(it.elseStatement != null) {
            scopeStack.push(new Scope(scopeStack.peek()));
            visit(it.elseStatement);
            scopeStack.pop();
        }
    }

    @Override
    public void visit(WhileNode it) {
        if(it.expression != null) {
            visit(it.expression);
            if(!it.expression.valueType.equals(gScope.getBoolType())) throw new syntaxError("While condition is not boolean", it.expression.pos());
        }
    }

    @Override
    public void visit(ForNode it) {
        scopeStack.push(new Scope(scopeStack.peek()));

        if(it.forStatement1 != null) { // fixme: restrict statement type.
            visit(it.forStatement1);
        }
        visit(it.forExpression);
        if(!it.forExpression.valueType.equals(gScope.getBoolType())) throw new syntaxError("For condition is not boolean", it.forExpression.pos());
        if(it.forStatement3 != null) { // fixme: restrict statement type.
            visit(it.forStatement3);
        }
        visit(it.forStatement);

        scopeStack.pop();
    }

    @Override
    public void visit(PostfixExpressionNode it) {
        visit(it.expression);
        if(!it.expression.valueType.equals(gScope.getIntType())) throw new syntaxError("PostfixExpression with none-int type", it.pos());
        it.valueType = gScope.getIntType();
    }

    @Override
    public void visit(NewExpressionNode it) {
        visit(it.creator);
        it.valueType = it.creator.valueType;
    }

    @Override
    public void visit(MemberExpressionNode it) {
        visit(it.expression);
        Type base = it.expression.valueType;
        /* io.debug(base.toString());
        io.debug(String.valueOf(base instanceof ClassType));
        io.debug(it.id);
        ((ClassType) base).printFunctions(); */
        if(!(base instanceof ClassType)) throw new syntaxError("Invalid member expression", it.pos());
        if(((ClassType) base).hasVariable(it.id, false)) it.valueType = ((ClassType) base).getVariable(it.id, false).type;
        else if(((ClassType) base).hasFunction(it.id, false)) it.valueType = ((ClassType) base).getFunction(it.id, false);
        else throw new syntaxError("Member " + it.id + " does not exist in class " + base.toString(), it.pos());
    }

    @Override
    public void visit(FuncCallExpressionNode it) {
        visit(it.expression);
        Type func = it.expression.valueType;
        if(!(func instanceof FunctionType)) throw new syntaxError(func.toString() + "is not callable", it.pos());
        if(it.parameters.size() != ((FunctionType) func).argTypes.size()) throw new syntaxError("incorrect numbers of arguments", it.pos());
        for(int i = 0; i < it.parameters.size(); i++) {
            visit(it.parameters.get(i));
            if(!it.parameters.get(i).valueType.equals(((FunctionType) func).argTypes.get(i))) throw new syntaxError("invalid type of parameters", it.parameters.get(i).pos());
        }
        it.valueType = ((FunctionType) func).returnType;
    }

    @Override
    public void visit(SubscriptExpressionNode it) {
        visit(it.array);
        Type array = it.array.valueType;
        if(!(array instanceof ArrayType)) throw new syntaxError("invalid array in subscriptExpression", it.array.pos());
        visit(it.index);
        if(!it.index.valueType.equals(gScope.getIntType())) throw new syntaxError("invalid index in subscriptExpression", it.index.pos());
        if(((ArrayType) array).dim == 1) {
            String type = ((ArrayType) array).basicType.toString();
            if(!gScope.hasType(type)) throw new internalError("Basic type not found after decleration???", it.pos());
            it.valueType = gScope.getType(type);
        } else it.valueType = new ArrayType(((ArrayType) array).dim - 1, ((ArrayType) array).basicType);
    }

    @Override
    public void visit(PrefixExpressionNode it) {
        visit(it.expression);
        if(it.op != PrefixExpressionNode.PrefixOp.Not) {
            if (!it.expression.valueType.equals(gScope.getIntType()))
                throw new syntaxError("None-! PrefixExpression with none-int type", it.pos());
            it.valueType = gScope.getIntType();
        } else {
            if (!it.expression.valueType.equals(gScope.getBoolType()))
                throw new syntaxError("~ PrefixExpression with none-boolean type", it.pos());
            it.valueType = gScope.getBoolType();
        }
    }

    @Override
    public void visit(BinaryExpressionNode it) {
        visit(it.src1);
        visit(it.src2);
        // io.debug(it.src1.valueType.toString());
        // io.debug(it.src2.valueType.toString());
        if(!it.src1.valueType.equals(it.src2.valueType)) {
            if((it.src1.valueType instanceof ArrayType && it.src2.valueType.equals(gScope.getNullType())) ||
                    (it.src2.valueType instanceof ArrayType && it.src1.valueType.equals(gScope.getNullType()))) { // fuck null
                if(it.op == BinaryExpressionNode.BianryOp.Equal || it.op == BinaryExpressionNode.BianryOp.NotEqual) it.valueType = gScope.getBoolType();
                else if(it.op == BinaryExpressionNode.BianryOp.Assign) {
                    if(it.src1.valueType instanceof ArrayType) it.valueType = gScope.getNullType();
                    else throw new syntaxError("invalid types 1 in BinaryExpression", it.pos());
                } else throw new syntaxError("invalid types 2 in BinaryExpression", it.pos());
            }
            else throw new syntaxError("different types in BinaryExpression", it.pos());
        }
        if(it.op == BinaryExpressionNode.BianryOp.Add || it.op == BinaryExpressionNode.BianryOp.Less || it.op == BinaryExpressionNode.BianryOp.LessEqual
                || it.op == BinaryExpressionNode.BianryOp.Greater || it.op == BinaryExpressionNode.BianryOp.GreaterEqual) {
            if(it.src1.valueType.equals(gScope.getStringType()) || it.src1.valueType.equals(gScope.getIntType())) it.valueType = it.op == BinaryExpressionNode.BianryOp.Add ? it.src1.valueType : gScope.getBoolType();
            else throw new syntaxError("invalid types 3 in BinaryExpression", it.pos());
        } else if(it.op == BinaryExpressionNode.BianryOp.Equal || it.op == BinaryExpressionNode.BianryOp.NotEqual) {
            if(it.src1.valueType.equals(gScope.getStringType()) || it.src1.valueType.equals(gScope.getIntType()) || it.src1.valueType.equals(gScope.getBoolType())) it.valueType = gScope.getBoolType();
            else throw new syntaxError("invalid types 4 in BinaryExpression", it.pos());
        } else if(it.op == BinaryExpressionNode.BianryOp.Sub || it.op == BinaryExpressionNode.BianryOp.Mul || it.op == BinaryExpressionNode.BianryOp.Div ||
                it.op == BinaryExpressionNode.BianryOp.Mod || it.op == BinaryExpressionNode.BianryOp.ShL || it.op == BinaryExpressionNode.BianryOp.ShR ||
                it.op == BinaryExpressionNode.BianryOp.And || it.op == BinaryExpressionNode.BianryOp.Xor || it.op == BinaryExpressionNode.BianryOp.Or) {
            if(it.src1.valueType.equals(gScope.getIntType())) it.valueType = gScope.getIntType();
            else throw new syntaxError("invalid types 5 in BinaryExpression", it.pos());
        } else if(it.op == BinaryExpressionNode.BianryOp.AndAnd || it.op == BinaryExpressionNode.BianryOp.OrOr) {
            if(it.src1.valueType.equals(gScope.getBoolType())) it.valueType = gScope.getBoolType();
            else throw new syntaxError("invalid types 6 in BinaryExpression", it.pos());
        } else if(it.op == BinaryExpressionNode.BianryOp.Assign) it.valueType = it.src1.valueType; // fixme: restrict type
        else throw new internalError("This should not happen in visit BinaryNode", new position(0, 0));
    }

    @Override
    public void visit(SubExpressionNode it) {
        visit(it.expression);
        it.valueType = it.expression.valueType;
    }

    @Override
    public void visit(ThisExpressionNode it) {
        if(currentClassStack.empty()) throw new syntaxError("invalid this expression", it.pos());
        assert(gScope.hasType(currentClassStack.peek()));
        it.valueType = gScope.getType(currentClassStack.peek());
    }

    @Override
    public void visit(ConstExpressionNode it) {
        if(it.isNull) it.valueType = gScope.getNullType();
        if(it.isStringConstant) it.valueType = gScope.getStringType();
        if(it.islogicConstant) it.valueType = gScope.getBoolType();
        if(it.isIntConstant) it.valueType = gScope.getIntType();
    }

    @Override
    public void visit(IdExpressionNode it) {
        if(scopeStack.peek().hasFunction(it.id, true)) it.valueType = scopeStack.peek().getFunction(it.id, true);
        else if(scopeStack.peek().hasVariable(it.id, true)) {
            it.valueType = scopeStack.peek().getVariable(it.id, true).type;
            // io.debug("in idexp node");
            // io.debug(it.valueType.toString());
            // if(it.valueType instanceof ClassType) ((ClassType) it.valueType).printFunctions();
        }
        else throw new syntaxError("invalid id expression", it.pos());
    }

    @Override
    public void visit(CreatorNode it) {
        if(it.isBasicCreator || it.isClassCreator) {
            if(!it.basicCreator.basicType.isIdentifier) throw new syntaxError("unable to create basic type with new", it.pos()); // fixme: is this necessary?
            String id = it.basicCreator.basicType.id;
            if(!gScope.hasType(id)) throw new syntaxError("invalid type" + id, it.pos());
            it.valueType = gScope.getType(id);
            // io.debug("in creater node");
            // io.debug(it.valueType.toString());
            // if(it.valueType instanceof ClassType) ((ClassType) it.valueType).printFunctions();
        } else if(it.isArrayCreator) {
            Type type = new TypeBuilder().build(it.arrayCreator.basicType);
            it.valueType = new ArrayType(it.arrayCreator.sizes.size(), type); // fixme: store sizes for codegen
        }
    }
}

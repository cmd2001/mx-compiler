package Frontend;

import AST.*;
import Util.*;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class SemanticChecker implements ASTVisitor {
    Stack<ControlFlow> controlFlowStack;
    Stack<Scope> scopes;
    GlobalScope gScope;

    @Override
    public void visit(ASTNode it) {
    }

    @Override
    public void visit(ProgramNode it) {
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
        scopes.push(gScope);
    }

    @Override
    public void visit(CompoundStatementNode it) {
        if(it.isFuncDefStatement) visit(it.functionDefNode);
        if(it.isClassDefStatement) visit(it.classDefNode);
        if(it.isVarDefStatement) visit(it.varDefStatementNode);
    }

    @Override
    public void visit(FunctionDefNode it) {
        Scope newScope = new Scope(scopes.peek());

        assert (it.argTypes.size() == it.argNames.size());
        for(int i = 0; i < it.argTypes.size(); i++) {
            if(gScope.hasType(it.argNames.get(i))) throw new syntaxError("Argument name same to a Class", it.pos()); // fixme: is this necessary?
            Type type = new TypeBuilder().build(it.argTypes.get(i));
            if(!gScope.hasType(type.toString())) throw new syntaxError("Invalid argument type " + type.toString(), it.pos());
            newScope.defineVariable(new Variable(type, it.argNames.get(i)), it.pos());
        }
        if(!it.isVoid) {
            Type returnType = new TypeBuilder().build(it.returnType);
            if (!gScope.hasType(returnType.toString())) throw new syntaxError("Invalid return type " + returnType.toString(), it.pos());
        }

        scopes.push(newScope);
        controlFlowStack.push(ControlFlow.FUNC);
        visit(it.funcBody);
        scopes.pop();
        controlFlowStack.pop();
    }

    @Override
    public void visit(StatementNode it) {
        if(it.isIf) visit(it.ifNode);
        if(it.isFor) visit(it.forNode);
        if(it.isWhile) visit(it.whileNode);
        if(it.isSimpleStatement) visit(it.simpleStatement);
    }

    @Override
    public void visit(ClassDefNode it) {

    }

    @Override
    public void visit(ConstructFunctionDefNode it) {

    }

    @Override
    public void visit(SimpleStatementNode it) {

    }

    @Override
    public void visit(ExpressionNode it) {

    }

    @Override
    public void visit(BlockNode it) {
        for(StatementNode x: it.statements) visit(x);
    }

    @Override
    public void visit(VarDefNode it) {

    }

    @Override
    public void visit(IfNode it) {

    }

    @Override
    public void visit(WhileNode it) {

    }

    @Override
    public void visit(ForNode it) {

    }

    @Override
    public void visit(PostfixExpressionNode it) {

    }

    @Override
    public void visit(NewExpressionNode it) {

    }

    @Override
    public void visit(MemberExpressionNode it) {

    }

    @Override
    public void visit(FuncCallExpressionNode it) {

    }

    @Override
    public void visit(SubscriptExpressionNode it) {

    }

    @Override
    public void visit(PrefixExpressionNode it) {

    }

    @Override
    public void visit(BinaryExpressionNode it) {

    }

    @Override
    public void visit(SubExpressionNode it) {

    }

    @Override
    public void visit(ThisExpressionNode it) {

    }

    @Override
    public void visit(ConstExpressionNode it) {

    }

    @Override
    public void visit(IdExpressionNode it) {

    }

    @Override
    public void visit(CreatorNode it) {

    }

    @Override
    public void visit(BasicCreatorNode it) {

    }

    @Override
    public void visit(ClassCreatorNode it) {

    }

    @Override
    public void visit(ArrayCreatorNode it) {

    }

    @Override
    public void visit(TypeNode it) {

    }

    @Override
    public void visit(ArrayTypeNode it) {

    }

    @Override
    public void visit(SimpleTypeNode it) {

    }

    @Override
    public void visit(VarDefStatementNode it) {

    }
}

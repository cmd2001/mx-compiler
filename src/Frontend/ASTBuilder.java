package Frontend;

import AST.*;
import Parser.mxBaseVisitor;
import Parser.mxParser;
import Util.position;

public class ASTBuilder extends mxBaseVisitor<ASTNode> {
	@Override
	public ProgramNode visitProgram(mxParser.ProgramContext ctx) {
		ProgramNode ret = new ProgramNode(new position(ctx));
		for(var x: ctx.compoundStatement()) ret.compoundStatements.add(visitCompoundStatement(x));
		return ret;
	}

	@Override
	public CompoundStatementNode visitCompoundStatement(mxParser.CompoundStatementContext ctx) {
		CompoundStatementNode ret = new CompoundStatementNode(new position(ctx));
		if(ctx.funcDefStatement() != null) {
			ret.isFuncDefStatement = true;
			ret.functionDefNode = visitFuncDefStatement(ctx.funcDefStatement());
		} else if(ctx.classDefStatement() != null) {
			ret.isClassDefStatement = true;
			ret.classDefNode = visitClassDefStatement(ctx.classDefStatement());
		} else if(ctx.varDefStatement() != null) {
			ret.isVarDefStatement = true;
			ret.varDefStatementNode = visitVarDefStatement(ctx.varDefStatement());
		} else ret.isEmpty = true;
		return ret;
	}

	@Override
	public FunctionDefNode visitFuncDefStatement(mxParser.FuncDefStatementContext ctx) {
		FunctionDefNode ret = new FunctionDefNode(new position(ctx));
		if(ctx.Void() != null) ret.isNull = true;
		else ret.returnType = (TypeNode) visit(ctx.type());
		ret.funcName = ctx.Identifier().getText();
		for(var x: ctx.argList().arg()) {
			ret.argTypes.add((TypeNode) visit(x.type()));
			ret.argNames.add(x.Identifier().getText());
		}
		ret.funcBody = visitBlock(ctx.block());
		return ret;
	}

	@Override
	public ClassDefNode visitClassDefStatement(mxParser.ClassDefStatementContext ctx) {
		ClassDefNode ret = new ClassDefNode(new position(ctx));
		ret.className = ctx.Identifier().getText();
		for(var x: ctx.funcDefStatement()) ret.functions.add(visitFuncDefStatement(x));
		for(var x: ctx.constructFuncDefStatement()) ret.constructFunction = visitConstructFuncDefStatement(x);
		for(var x: ctx.varDefStatement()) ret.variables.add(visitVarDefStatement(x));
		return ret;
	}

	@Override
	public VarDefStatementNode visitVarDefStatement(mxParser.VarDefStatementContext ctx) {
		VarDefStatementNode ret = new VarDefStatementNode(new position(ctx));
		ret.type = (TypeNode) visit(ctx.type());
		for(var x: ctx.varDef()) ret.variables.add(visitVarDef(x));
		return ret;
	}

	@Override
	public VarDefNode visitVarDef(mxParser.VarDefContext ctx) {
		VarDefNode ret = new VarDefNode(new position(ctx));
		ret.variableName = ctx.Identifier().getText();
		ret.expression = (ExpressionNode) visit(ctx.expression());
		return ret;
	}

	@Override
	public ConstructFunctionDefNode visitConstructFuncDefStatement(mxParser.ConstructFuncDefStatementContext ctx) {
		ConstructFunctionDefNode ret = new ConstructFunctionDefNode(new position(ctx));
		ret.constructionFunctionName = ctx.Identifier().getText();
		ret.block = visitBlock(ctx.block());
		return ret;
	}

	@Override
	public BlockNode visitBlock(mxParser.BlockContext ctx) {
		BlockNode ret = new BlockNode(new position(ctx));
		for(var x: ctx.statement()) ret.statements.add((StatementNode) visit(x));
		return ret;
	}

	@Override
	public SimpleStatementNode visitBreakStatement(mxParser.BreakStatementContext ctx) {
		SimpleStatementNode ret = new SimpleStatementNode(new position(ctx));
		ret.isBreak = true;
		return ret;
	}

	@Override
	public SimpleStatementNode visitContinueStatement(mxParser.ContinueStatementContext ctx) {
		SimpleStatementNode ret = new SimpleStatementNode(new position(ctx));
		ret.isContinue = true;
		return ret;
	}

	@Override
	public SimpleStatementNode visitExpressionStatement(mxParser.ExpressionStatementContext ctx) {
		SimpleStatementNode ret = new SimpleStatementNode(new position(ctx));
		ret.isExpression = true;
		ret.expression = (ExpressionNode) visit(ctx.expression());
		return ret;
	}

	@Override
	public SimpleStatementNode visitBlockStatement(mxParser.BlockStatementContext ctx) {
		SimpleStatementNode ret = new SimpleStatementNode(new position(ctx));
		ret.isBlock = true;
		ret.block = visitBlock(ctx.block());
		return ret;
	}

	@Override
	public SimpleStatementNode visitVarStatement(mxParser.VarStatementContext ctx) {
		SimpleStatementNode ret = new SimpleStatementNode(new position(ctx));
		ret.isVarDefStatement = true;
		ret.varDefStatement = visitVarDefStatement(ctx.varDefStatement());
		return ret;
	}

	@Override
	public StatementNode visitIfStatement(mxParser.IfStatementContext ctx) {
		StatementNode ret = new StatementNode(new position(ctx));
		ret.isIf = true;
		ret.ifNode = new IfNode(new position(ctx));
		ret.ifNode.expression = (ExpressionNode) visit(ctx.expression());
		ret.ifNode.ifStatement = (StatementNode) visit(ctx.statement(0));
		if(ctx.Else() != null) {
			ret.ifNode.haveElse = true;
			ret.ifNode.elseStatement = (StatementNode) visit(ctx.statement(0));
		}
		return ret;
 	}

	@Override
	public StatementNode visitWhileStatement(mxParser.WhileStatementContext ctx) {
		StatementNode ret = new StatementNode(new position(ctx));
		ret.isWhile = true;
		ret.whileNode.expression = (ExpressionNode) visit(ctx.expression());
		ret.whileNode.statement = (StatementNode) visit(ctx.statement());
		return ret;
	}

	@Override
	public StatementNode visitForStatement(mxParser.ForStatementContext ctx) {
		StatementNode ret = new StatementNode(new position(ctx));
		ret.isFor = true;
		ret.forNode.forStatement1 = (SimpleStatementNode) visit(ctx.stmt1);
		ret.forNode.forStatement3 = (SimpleStatementNode) visit(ctx.stmt2);
		ret.forNode.forStatement = (StatementNode) visit(ctx.statement());
		for(var x: ctx.expressionList().expression()) ret.forNode.forExpressions.add((ExpressionNode) visit(x));
		return ret;
	}

	@Override
	public StatementNode visitContainSimpleStatement(mxParser.ContainSimpleStatementContext ctx) {
		StatementNode ret = new StatementNode(new position(ctx));
		ret.isSimpleStatement = true;
		ret.simpleStatement = (SimpleStatementNode) visit(ctx.simpleStatement());
		return ret;
	}

	@Override
	public ExpressionNode visitBinaryExpression(mxParser.BinaryExpressionContext ctx) {
		ExpressionNode ret = new ExpressionNode(new position(ctx));
		ret.expressionType = ExpressionNode.ExpressionType.Binary;
		var op = ctx.op.getText();
		ret.binaryExpressionNode.op = switch (op) {
			case "*": yield BinaryExpressionNode.BianryOp.Mul;
			case "/": yield BinaryExpressionNode.BianryOp.Div;
			case "%": yield BinaryExpressionNode.BianryOp.Mod;
			case "+": yield BinaryExpressionNode.BianryOp.Add;
			case "-": yield BinaryExpressionNode.BianryOp.Sub;
			case "<<": yield BinaryExpressionNode.BianryOp.ShL;
			case ">>": yield BinaryExpressionNode.BianryOp.ShR;
			case "<": yield BinaryExpressionNode.BianryOp.Less;
			case ">": yield BinaryExpressionNode.BianryOp.Greater;
			case "<=": yield BinaryExpressionNode.BianryOp.LessEqual;
			case ">=": yield BinaryExpressionNode.BianryOp.GreaterEqual;
			case "==": yield BinaryExpressionNode.BianryOp.Equal;
			case "!=": yield BinaryExpressionNode.BianryOp.NotEqual;
			case "&": yield BinaryExpressionNode.BianryOp.And;
			case "^": yield BinaryExpressionNode.BianryOp.Xor;
			case "|": yield BinaryExpressionNode.BianryOp.Or;
			case "&&": yield BinaryExpressionNode.BianryOp.AndAnd;
			case "||": yield BinaryExpressionNode.BianryOp.OrOr;
			case "=": yield BinaryExpressionNode.BianryOp.Assign;
			default: throw new IllegalArgumentException(op);
		};
		ret.binaryExpressionNode.src1 = (ExpressionNode) visit(ctx.src1);
		ret.binaryExpressionNode.src2 = (ExpressionNode) visit(ctx.src2);
 		return ret;
	}

	@Override
	public ExpressionNode visitPrefixExpression(mxParser.PrefixExpressionContext ctx) {
		ExpressionNode ret = new ExpressionNode(new position(ctx));
		ret.expressionType = ExpressionNode.ExpressionType.Prefix;
		var op = ctx.op.getText();
		ret.prefixExpressionNode.op = switch (op) {
			case "++": yield PrefixExpressionNode.PrefixOp.AddAdd;
			case "--": yield PrefixExpressionNode.PrefixOp.SubSub;
			case "+": yield PrefixExpressionNode.PrefixOp.Add;
			case "-": yield PrefixExpressionNode.PrefixOp.Sub;
			case "!": yield PrefixExpressionNode.PrefixOp.Not;
			case "~": yield PrefixExpressionNode.PrefixOp.Neg;
			default: throw new IllegalArgumentException(op);
		};
		ret.prefixExpressionNode.expression = (ExpressionNode) visit(ctx.expression());
		return ret;
	}

	@Override
	public ExpressionNode visitIdExpression(mxParser.IdExpressionContext ctx) {
		ExpressionNode ret = new ExpressionNode(new position(ctx));
		ret.expressionType = ExpressionNode.ExpressionType.Id;
		ret.idExpressionNode.id = ctx.Identifier().getText();
		return ret;
	}

	@Override
	public ExpressionNode visitSubscriptExpression(mxParser.SubscriptExpressionContext ctx) {
		ExpressionNode ret = new ExpressionNode(new position(ctx));
		ret.expressionType = ExpressionNode.ExpressionType.Subscript;
		ret.subscriptExpressionNode.array = (ExpressionNode) visit(ctx.array);
		ret.subscriptExpressionNode.index = (ExpressionNode) visit(ctx.index);
		return ret;
	}

	@Override
	public ExpressionNode visitThisExpression(mxParser.ThisExpressionContext ctx) {
		ExpressionNode ret = new ExpressionNode(new position(ctx));
		ret.expressionType = ExpressionNode.ExpressionType.This;
		return ret;
	}

	@Override
	public ExpressionNode visitConstExpression(mxParser.ConstExpressionContext ctx) {
		ExpressionNode ret = new ExpressionNode(new position(ctx));
		ret.expressionType = ExpressionNode.ExpressionType.Const;
		var con = ctx.constant();
		if(con.logicConstant() != null) {
			ret.constExpressionNode.islogicConstant = true;
			ret.constExpressionNode.logicConstant = (con.logicConstant().True() != null);
		} else if(con.IntConstant() != null) {
			ret.constExpressionNode.isIntConstant = true;
			ret.constExpressionNode.intConstant = Integer.parseInt(con.IntConstant().getText());
		} else if(con.StringConstant() != null) {
			ret.constExpressionNode.isStringConstant = true;
			ret.constExpressionNode.stringConstant = con.StringConstant().getText();
		} else if(con.Null() != null) {
			ret.constExpressionNode.isNull = true;
		}
		return ret;
	}

	@Override
	public ExpressionNode visitNewExpression(mxParser.NewExpressionContext ctx) {
		ExpressionNode ret = new ExpressionNode(new position(ctx));
		ret.expressionType = ExpressionNode.ExpressionType.New;
		ret.newExpressionNode.creator = (CreatorNode) visit(ctx.creator());
		return ret;
	}

	@Override
	public ExpressionNode visitMemberExpression(mxParser.MemberExpressionContext ctx) {
		ExpressionNode ret = new ExpressionNode(new position(ctx));
		ret.expressionType = ExpressionNode.ExpressionType.Member;
		ret.memberExpressionNode.expression = (ExpressionNode) visit(ctx.expression());
		ret.memberExpressionNode.id = ctx.Identifier().getText();
		return ret;
	}

	@Override
	public ExpressionNode visitSubExpression(mxParser.SubExpressionContext ctx) {
		ExpressionNode ret = new ExpressionNode(new position(ctx));
		ret.expressionType = ExpressionNode.ExpressionType.Sub;
		ret.subExpressionNode.expression = (ExpressionNode) visit(ctx.expression());
		return ret;
	}

	@Override
	public ExpressionNode visitPostfixExpression(mxParser.PostfixExpressionContext ctx) {
		ExpressionNode ret = new ExpressionNode(new position(ctx));
		ret.expressionType = ExpressionNode.ExpressionType.Postfix;
		var op = ctx.op.getText();
		ret.postfixExpressionNode.op = switch (op) {
			case "++": yield PostfixExpressionNode.PostfixOp.AddAdd;
			case "--": yield PostfixExpressionNode.PostfixOp.SubSub;
			default: throw new IllegalArgumentException(op);
		};
		ret.postfixExpressionNode.expression = (ExpressionNode) visit(ctx.expression());
		return ret;
	}

	@Override
	public ExpressionNode visitFuncCallExpression(mxParser.FuncCallExpressionContext ctx) {
		ExpressionNode ret = new ExpressionNode(new position(ctx));
		ret.expressionType = ExpressionNode.ExpressionType.FunCall;
		ret.funcCallExpressionNode.expression = (ExpressionNode) visit(ctx.expression());
		for(var x: ctx.expressionList().expression()) ret.funcCallExpressionNode.parameters.add((ExpressionNode) visit(x));
		return ret;
	}

	@Override
	public CreatorNode visitBasicCreator(mxParser.BasicCreatorContext ctx) {
		CreatorNode ret = new CreatorNode(new position(ctx));
		ret.isBasicCreator = true;
		ret.basicCreator.basicType = visitBasicType(ctx.basicType());
		return ret;
	}

	@Override
	public CreatorNode visitClassCreator(mxParser.ClassCreatorContext ctx) {
		CreatorNode ret = new CreatorNode(new position(ctx));
		ret.isClassCreator = true;
		ret.classCreator.basicType = visitBasicType(ctx.basicType());
		return ret;
	}

	@Override
	public CreatorNode visitArrayCreator(mxParser.ArrayCreatorContext ctx) {
		CreatorNode ret = new CreatorNode(new position(ctx));
		ret.isArrayCreator = true;
		ret.arrayCreator.basicType = visitBasicType(ctx.basicType());
		for(var x: ctx.expression()) ret.arrayCreator.sizes.add((ExpressionNode) visit(x));
		return ret;
	}

	@Override
	public BasicTypeNode visitBasicType(mxParser.BasicTypeContext ctx) {
		BasicTypeNode ret = new BasicTypeNode(new position(ctx));
		if(ctx.Int() != null) {
			ret.isInt = true;
		} else if(ctx.Bool() != null) {
			ret.isBool = true;
		} else if(ctx.String() != null) {
			ret.isString = true;
		} else if(ctx.Identifier() != null) {
			ret.isIdentifier = true;
			ret.id = ctx.Identifier().getText();
		}
		return ret;
	}

	@Override
	public TypeNode visitArrayType(mxParser.ArrayTypeContext ctx) {
		TypeNode ret = new TypeNode(new position(ctx));
		ret.isArrayType = true;
		ret.basicType = visitBasicType(ctx.basicType());
		return ret;
	}

	@Override
	public TypeNode visitSimpleType(mxParser.SimpleTypeContext ctx) {
		TypeNode ret = new TypeNode(new position(ctx));
		ret.isSimpleType = true;
		ret.basicType = visitBasicType(ctx.basicType());
		return ret;
	}
}
// Generated from /Users/xzy/IdeaProjects/mx-compiler/src/Parser/mx.g4 by ANTLR 4.9
package Parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link mxParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface mxVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link mxParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(mxParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link mxParser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(mxParser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link mxParser#funcDefStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDefStatement(mxParser.FuncDefStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link mxParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg(mxParser.ArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link mxParser#argList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgList(mxParser.ArgListContext ctx);
	/**
	 * Visit a parse tree produced by {@link mxParser#classDefStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDefStatement(mxParser.ClassDefStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link mxParser#varDefStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDefStatement(mxParser.VarDefStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link mxParser#varDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDef(mxParser.VarDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link mxParser#constructFuncDefStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructFuncDefStatement(mxParser.ConstructFuncDefStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link mxParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(mxParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnStatement}
	 * labeled alternative in {@link mxParser#simpleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(mxParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code breakStatement}
	 * labeled alternative in {@link mxParser#simpleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(mxParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code continueStatement}
	 * labeled alternative in {@link mxParser#simpleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(mxParser.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionStatement}
	 * labeled alternative in {@link mxParser#simpleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(mxParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blockStatement}
	 * labeled alternative in {@link mxParser#simpleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(mxParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varStatement}
	 * labeled alternative in {@link mxParser#simpleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarStatement(mxParser.VarStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link mxParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(mxParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link mxParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(mxParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forStatement}
	 * labeled alternative in {@link mxParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(mxParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code containSimpleStatement}
	 * labeled alternative in {@link mxParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainSimpleStatement(mxParser.ContainSimpleStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binaryExpression}
	 * labeled alternative in {@link mxParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpression(mxParser.BinaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code prefixExpression}
	 * labeled alternative in {@link mxParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixExpression(mxParser.PrefixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idExpression}
	 * labeled alternative in {@link mxParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExpression(mxParser.IdExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subscriptExpression}
	 * labeled alternative in {@link mxParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscriptExpression(mxParser.SubscriptExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code thisExpression}
	 * labeled alternative in {@link mxParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisExpression(mxParser.ThisExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constExpression}
	 * labeled alternative in {@link mxParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstExpression(mxParser.ConstExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code newExpression}
	 * labeled alternative in {@link mxParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewExpression(mxParser.NewExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code memberExpression}
	 * labeled alternative in {@link mxParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberExpression(mxParser.MemberExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subExpression}
	 * labeled alternative in {@link mxParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubExpression(mxParser.SubExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code postfixExpression}
	 * labeled alternative in {@link mxParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression(mxParser.PostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcCallExpression}
	 * labeled alternative in {@link mxParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCallExpression(mxParser.FuncCallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code basicCreator}
	 * labeled alternative in {@link mxParser#creator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicCreator(mxParser.BasicCreatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code classCreator}
	 * labeled alternative in {@link mxParser#creator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassCreator(mxParser.ClassCreatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayCreator}
	 * labeled alternative in {@link mxParser#creator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreator(mxParser.ArrayCreatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link mxParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(mxParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link mxParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(mxParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link mxParser#logicConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicConstant(mxParser.LogicConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link mxParser#basicType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicType(mxParser.BasicTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayType}
	 * labeled alternative in {@link mxParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(mxParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleType}
	 * labeled alternative in {@link mxParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleType(mxParser.SimpleTypeContext ctx);
}
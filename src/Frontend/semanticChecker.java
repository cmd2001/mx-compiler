package Frontend;

import AST.*;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class semanticChecker implements ASTVisitor {
    HashSet<String> types;
    Stack<HashMap<String, Type> > variable;
    @Override
    public void visit(ASTNode it) {
    }

    @Override
    public void visit(ProgramNode it) {

    }

    @Override
    public void visit(CompoundStatementNode it) {

    }

    @Override
    public void visit(FunctionDefNode it) {

    }

    @Override
    public void visit(StatementNode it) {

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

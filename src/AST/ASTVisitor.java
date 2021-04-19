package AST;

public interface ASTVisitor {
    void visit(ASTNode it);
    void visit(ProgramNode it);
    void visit(CompoundStatementNode it);
    void visit(FunctionDefNode it);
    void visit(StatementNode it);
    void visit(ClassDefNode it);
    void visit(ConstructFunctionDefNode it);
    void visit(SimpleStatementNode it);
    void visit(ExpressionNode it);
    void visit(BlockNode it);
    void visit(IfNode it);
    void visit(WhileNode it);
    void visit(ForNode it);
    void visit(PostfixExpressionNode it);
    void visit(NewExpressionNode it);
    void visit(MemberExpressionNode it);
    void visit(FuncCallExpressionNode it);
    void visit(SubscriptExpressionNode it);
    void visit(PrefixExpressionNode it);
    void visit(BinaryExpressionNode it);
    void visit(SubExpressionNode it);
    void visit(ThisExpressionNode it);
    void visit(ConstExpressionNode it);
    void visit(IdExpressionNode it);
    void visit(CreatorNode it);
    void visit(VarDefStatementNode it);
    // etc...
}

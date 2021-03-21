package AST;

public interface ASTVisitor {
    void visit(ASTNode it);
    void visit(FunctionDefNode it);
    void visit(VariableNode it);
    void visit(StatementNode it);
    void visit(ClassDefNode it);
    void visit(ConstructFunctionDefNode it);
    void visit(SimpleStatementNode it);
    void visit(BreakNode it);
    void visit(ContinueNode it);
    void visit(ExpressionNode it);
    void visit(BlockNode it);
    void visit(VarDefNode it);
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
    void visit(BasicCreatorNode it);
    void visit(ClassCreatorNode it);
    void visit(ArrayCreatorNode it);
    void visit(TypeNode it);
    void visit(ArrayTypeNode it);
    void visit(SimpleTypeNode it);
    // etc...
}
package AST;

import Util.position;

public class ExpressionNode extends ASTNode {
    public enum ExpressionType {None, Postfix, New, Member, FunCall, Subscript, Prefix, Binary, Sub, This, Const, Id}

    public ExpressionType expressionType = ExpressionType.None;

    public PostfixExpressionNode postfixExpressionNode;
    public NewExpressionNode newExpressionNode;
    public MemberExpressionNode memberExpressionNode;
    public FuncCallExpressionNode funcCallExpressionNode;
    public SubscriptExpressionNode subscriptExpressionNode;
    public PrefixExpressionNode prefixExpressionNode;
    public BinaryExpressionNode binaryExpressionNode;
    public SubExpressionNode subExpressionNode;
    public ThisExpressionNode thisExpressionNode;
    public ConstExpressionNode constExpressionNode;
    public IdExpressionNode idExpressionNode;

    public ExpressionNode(position pos) {
        super(pos);
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
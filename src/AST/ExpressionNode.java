package AST;

import Util.position;

public class ExpressionNode extends ASTNode {
    public enum ExpressionType {None, Postfix, New, Member, FunCall, Subscript, Prefix, Binary, Sub, This, Const, Id}

    public ExpressionType expressionType = ExpressionType.None;

    PostfixExpressionNode postfixExpressionNode;
    NewExpressionNode newExpressionNode;
    MemberExpressionNode memberExpressionNode;
    FuncCallExpressionNode funcCallExpressionNode;
    SubscriptExpressionNode subscriptExpressionNode;
    PrefixExpressionNode prefixExpressionNode;
    BinaryExpressionNode binaryExpressionNode;
    SubExpressionNode subExpressionNode;
    ThisExpressionNode thisExpressionNode;
    ConstExpressionNode constExpressionNode;
    IdExpressionNode idExpressionNode;

    public ExpressionNode(position pos) {
        super(pos);
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
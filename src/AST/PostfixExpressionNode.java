package AST;

import Util.position;

public class PostfixExpressionNode extends ASTNode {
    public enum PostfixOp {None, AddAdd, SubSub}
    public PostfixOp op = PostfixOp.None;
    public ExpressionNode expression;

    public PostfixExpressionNode(position pos) {
        super(pos);
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
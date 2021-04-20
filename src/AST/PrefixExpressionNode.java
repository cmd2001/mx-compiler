package AST;

import Util.Type;
import Util.position;

public class PrefixExpressionNode extends ASTNode {
    public enum PrefixOp {None, AddAdd, SubSub, Add, Sub, Not, Neg}
    public PrefixOp op = PrefixOp.None;
    public ExpressionNode expression;
    public Type valueType;
    public boolean isLeft;

    public PrefixExpressionNode(position pos) {
        super(pos);
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
package AST;

import Util.position;

public class PrefixExpressionNode extends ASTNode {
    public enum PrefixOp {None, PlusPlus, SubSub, Plus, Sub, Not, Neg}
    public PrefixOp op = PrefixOp.None;
    public ExpressionNode expression;

    public PrefixExpressionNode(position pos) {
        super(pos);
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
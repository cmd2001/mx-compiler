package AST;

import Util.position;

public class SubscriptExpressionNode extends ASTNode {
    public SubscriptExpressionNode(position pos) {
        super(pos);
    }

    @Override
    public String toString() {
        return "";
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
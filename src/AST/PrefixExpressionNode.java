package AST;

import Util.position;

public class PrefixExpressionNode extends ASTNode {
    public PrefixExpressionNode(position pos) {
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
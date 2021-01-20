package AST;

import Util.position;

public class BreakNode extends ASTNode {
    public BreakNode(position pos) {
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

package AST;

import Util.position;

abstract public class ASTNode {
    private position pos;

    public ASTNode(position pos) {
        this.pos = pos;
    }

    public position pos() {
        return pos;
    }

    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}

package AST;

import Util.position;

abstract public class ASTNode {
    public position pos;

    public ASTNode(position pos) {
        this.pos = pos;
    }

    abstract public void accept(ASTVisitor visitor);

    @Override
    abstract public String toString();

    @Override
    public int hashCode() {
        return toString().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ASTNode) {
            return toString().equals(obj.toString());
        }
        return false;
    }
}

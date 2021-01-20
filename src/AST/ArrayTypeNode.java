package AST;

import Util.position;

public class ArrayTypeNode extends ASTNode {
    public ArrayTypeNode(position pos) {
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
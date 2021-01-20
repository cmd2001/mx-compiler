package AST;

import Util.position;

public class SimpleTypeNode extends ASTNode {
    public SimpleTypeNode(position pos) {
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
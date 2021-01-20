package AST;

import Util.position;

public class ArrayCreatorNode extends ASTNode {
    public ArrayCreatorNode(position pos) {
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
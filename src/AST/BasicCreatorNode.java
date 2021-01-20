package AST;

import Util.position;

public class BasicCreatorNode extends ASTNode {
    public BasicCreatorNode(position pos) {
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
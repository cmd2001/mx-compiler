package AST;

import Util.position;

public class ClassCreatorNode extends ASTNode {
    public ClassCreatorNode(position pos) {
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
package AST;

import Util.position;

public class ContinueNode extends ASTNode {
    public ContinueNode(position pos) {
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

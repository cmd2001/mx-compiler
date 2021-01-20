package AST;

import Util.position;

public class ClassDefNode extends ASTNode {
    public ClassDefNode(position pos) {
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
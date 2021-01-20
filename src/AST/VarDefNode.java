package AST;

import Util.position;

public class VarDefNode extends ASTNode {
    public VarDefNode(position pos) {
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
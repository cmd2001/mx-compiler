package AST;

import Util.position;

public class WhileNode extends ASTNode {
    public WhileNode(position pos) {
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
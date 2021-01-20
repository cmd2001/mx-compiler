package AST;

import Util.position;

public class SimpleStatementNode extends ASTNode {
    public SimpleStatementNode(position pos) {
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
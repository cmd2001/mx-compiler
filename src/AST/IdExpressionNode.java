package AST;

import Util.position;

public class IdExpressionNode extends ASTNode {
    public IdExpressionNode(position pos) {
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
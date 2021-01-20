package AST;

import Util.position;

public class BinaryExpressionNode extends ASTNode {
    public BinaryExpressionNode(position pos) {
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
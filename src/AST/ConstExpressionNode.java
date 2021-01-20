package AST;

import Util.position;

public class ConstExpressionNode extends ASTNode {
    public ConstExpressionNode(position pos) {
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
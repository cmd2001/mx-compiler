package AST;

import Util.position;

public class SubExpressionNode extends ASTNode {
    public SubExpressionNode(position pos) {
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
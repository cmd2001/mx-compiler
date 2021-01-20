package AST;

import Util.position;

public class PostfixExpressionNode extends ASTNode {
    public PostfixExpressionNode(position pos) {
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
package AST;

import Util.position;

public class NewExpressionNode extends ASTNode {
    public NewExpressionNode(position pos) {
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
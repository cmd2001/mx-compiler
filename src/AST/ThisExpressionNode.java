package AST;

import Util.position;

public class ThisExpressionNode extends ASTNode {
    public ThisExpressionNode(position pos) {
        super(pos);
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
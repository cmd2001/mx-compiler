package AST;

import Util.position;

public class SubscriptExpressionNode extends ASTNode {
    public ExpressionNode array, index;
    
    public SubscriptExpressionNode(position pos) {
        super(pos);
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
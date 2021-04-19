package AST;

import Util.Type;
import Util.position;

public class SubscriptExpressionNode extends ASTNode {
    public ExpressionNode array, index;
    public Type valueType;
    
    public SubscriptExpressionNode(position pos) {
        super(pos);
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
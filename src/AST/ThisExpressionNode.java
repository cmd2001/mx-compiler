package AST;

import Util.Type;
import Util.position;

public class ThisExpressionNode extends ASTNode {
    public Type valueType;
    public ThisExpressionNode(position pos) {
        super(pos);
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
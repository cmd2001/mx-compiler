package AST;

import Util.Type;
import Util.position;

public class IdExpressionNode extends ASTNode {
    public String id;
    public Type valueType;

    public IdExpressionNode(position pos) {
        super(pos);
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
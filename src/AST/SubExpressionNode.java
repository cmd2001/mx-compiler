package AST;

import Util.Type;
import Util.position;

public class SubExpressionNode extends ASTNode {
    public ExpressionNode expression;
    public Type valueType;

    public SubExpressionNode(position pos) {
        super(pos);
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
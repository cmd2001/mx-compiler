package AST;

import Util.position;

public class SubExpressionNode extends ASTNode {
    ExpressionNode expression;

    public SubExpressionNode(position pos) {
        super(pos);
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
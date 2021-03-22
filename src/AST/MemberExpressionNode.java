package AST;

import Util.position;

public class MemberExpressionNode extends ASTNode {
    public ExpressionNode expression;
    public String id;

    public MemberExpressionNode(position pos) {
        super(pos);
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
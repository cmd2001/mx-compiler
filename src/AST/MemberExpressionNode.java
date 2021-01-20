package AST;

import Util.position;

public class MemberExpressionNode extends ASTNode {
    public MemberExpressionNode(position pos) {
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
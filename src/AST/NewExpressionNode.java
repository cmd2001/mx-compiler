package AST;

import Util.position;

public class NewExpressionNode extends ASTNode {
    public CreatorNode creator;
    public NewExpressionNode(position pos) {
        super(pos);
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
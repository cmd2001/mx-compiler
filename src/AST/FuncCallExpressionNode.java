package AST;

import Util.position;

public class FuncCallExpressionNode extends ASTNode {
    public FuncCallExpressionNode(position pos) {
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
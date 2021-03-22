package AST;

import Util.position;

import java.util.ArrayList;

public class FuncCallExpressionNode extends ASTNode {
    public ExpressionNode expression;
    public ArrayList<ExpressionNode> parameters = new ArrayList<>();

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
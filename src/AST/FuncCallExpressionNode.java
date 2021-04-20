package AST;

import Util.Type;
import Util.position;

import java.util.ArrayList;

public class FuncCallExpressionNode extends ASTNode {
    public ExpressionNode expression;
    public ArrayList<ExpressionNode> parameters = new ArrayList<>();
    public Type valueType;
    public boolean isLeft;

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
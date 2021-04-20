package AST;

import Util.position;

import java.util.ArrayList;

public class ArrayCreatorNode extends ASTNode {
    public BasicTypeNode basicType;
    public ArrayList<ExpressionNode> sizes = new ArrayList<>();
    public int dim;

    public ArrayCreatorNode(position pos) {
        super(pos);
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
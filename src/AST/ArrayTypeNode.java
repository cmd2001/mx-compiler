package AST;

import Util.position;

public class ArrayTypeNode extends ASTNode {
    public BasicTypeNode basicType;

    public ArrayTypeNode(position pos) {
        super(pos);
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
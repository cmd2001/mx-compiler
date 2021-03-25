package AST;

import Util.position;

public class TypeNode extends ASTNode {
    public boolean isArrayType = false, isSimpleType = false;
    public BasicTypeNode basicType;

    public TypeNode(position pos) {
        super(pos);
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}

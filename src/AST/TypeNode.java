package AST;

import Util.position;

public class TypeNode extends ASTNode {
    boolean isArrayType = false, isSimpleType = false;
    ArrayTypeNode arrayType;
    BasicTypeNode basicType;

    public TypeNode(position pos) {
        super(pos);
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}

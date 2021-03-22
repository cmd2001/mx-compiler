package AST;

import Util.position;

public class ClassCreatorNode extends ASTNode {
    public BasicTypeNode basicType;
    public ClassCreatorNode(position pos) {
        super(pos);
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
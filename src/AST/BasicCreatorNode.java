package AST;

import Util.position;

public class BasicCreatorNode extends ASTNode {
    public BasicTypeNode basicType;

    public BasicCreatorNode(position pos) {
        super(pos);
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
package AST;


import Util.position;

public class BasicTypeNode extends ASTNode {
    public boolean isInt = false, isBool = false, isString =false, isIdentifier = false;
    public String id;

    public BasicTypeNode(position pos) {
        super(pos);
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}

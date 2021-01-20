package AST;

import Util.Type;
import Util.position;

public class ConstructFunctionDefNode extends ASTNode {
    private Type type;
    private String iden;
    public ConstructFunctionDefNode(position pos) {
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
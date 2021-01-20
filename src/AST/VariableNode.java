package  AST;

import Util.position;
import Util.Type;

public class VariableNode extends ASTNode {
    private Type type;
    private String iden;
    public VariableNode(position pos, Type type, String iden) {
        super(pos);
        this.type = type;
        this.iden = iden;
    }

    @Override
    public String toString() {
        StringBuilder ret = new StringBuilder("<Variable>\n");
        ret.append(type.toString() + "\n");
        ret.append(iden + "\n");
        return ret.toString();
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
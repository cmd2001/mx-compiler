package AST;

import Util.position;

public class VarDefNode extends ASTNode {
    public String variableName;
    public ExpressionNode expression;

    public VarDefNode(position pos) {
        super(pos);
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}

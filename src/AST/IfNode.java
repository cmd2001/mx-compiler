package AST;

import Util.position;

public class IfNode extends ASTNode {
    public boolean haveElse = false;
    public ExpressionNode expression;
    public StatementNode ifStatement, elseStatement;

    public IfNode(position pos) {
        super(pos);
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}

package AST;

import Util.position;

public class IfNode extends ASTNode {
    public boolean ifIsBlock = false, elseIsBlock = false;
    public ExpressionNode ifExpression;
    public BlockNode ifBlock, elseBlock;
    public StatementNode ifStatement, elseStatement;

    public IfNode(position pos) {
        super(pos);
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}

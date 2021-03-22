package AST;

import Util.position;

public class ForNode extends ASTNode {
    public boolean forIsBlock = false;
    public SimpleStatementNode forStatement1, forStatement3;
    public ExpressionNode forExpression;
    public BlockNode forBlock;
    public StatementNode forStatement;

    public ForNode(position pos) {
        super(pos);
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}

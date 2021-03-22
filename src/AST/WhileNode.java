package AST;

import Util.position;

public class WhileNode extends ASTNode {
    public boolean whileIsBlock = false;
    public ExpressionNode whileExpression;
    public BlockNode whileBlock;
    public StatementNode whileStatement;

    public WhileNode(position pos) {
        super(pos);
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}

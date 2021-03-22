package AST;

import Util.position;

public class SimpleStatementNode extends ASTNode {
    public boolean isReturn = false, isBreak = false, isContinue = false, isExpression = false, isBlock = false, isVarDefStatement = false;
    public ExpressionNode expression;
    public BlockNode block;
    public varDefStatementNode varDefStatement;
    public SimpleStatementNode(position pos) {
        super(pos);
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
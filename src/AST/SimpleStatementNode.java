package AST;

import Util.position;

public class SimpleStatementNode extends ASTNode {
    public boolean isReturn = false, isBreak = false, isContinue = false, isExpression = false,  isVarDefStatement = false;
    public ExpressionNode expression;
    public VarDefStatementNode varDefStatement;
    public SimpleStatementNode(position pos) {
        super(pos);
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
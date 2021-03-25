package AST;

import Util.position;

import java.util.ArrayList;

public class ForNode extends ASTNode {
    public SimpleStatementNode forStatement1, forStatement3;
    public ArrayList<ExpressionNode> forExpressions;
    public StatementNode forStatement;

    public ForNode(position pos) {
        super(pos);
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}

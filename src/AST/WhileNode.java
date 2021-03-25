package AST;

import Util.position;

public class WhileNode extends ASTNode {
    public ExpressionNode expression;
    public StatementNode statement;

    public WhileNode(position pos) {
        super(pos);
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}

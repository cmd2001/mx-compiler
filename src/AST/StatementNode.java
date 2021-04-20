package AST;

import Util.position;

public class StatementNode extends ASTNode {
    public boolean isIf = false, isWhile = false, isFor = false, isSimpleStatement = false, isBlock = false;
    public IfNode ifNode;
    public WhileNode whileNode;
    public ForNode forNode;
    public SimpleStatementNode simpleStatement;
    public BlockNode blockNode;

    public StatementNode(position pos) {
        super(pos);
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
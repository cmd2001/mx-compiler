package AST;

import Util.position;

import java.util.ArrayList;

public class BlockNode extends ASTNode {
    public ArrayList<StatementNode> statements = new ArrayList<>();

    public BlockNode(position pos) {
        super(pos);
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}

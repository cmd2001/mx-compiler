package AST;

import Util.Type;
import Util.position;

public class StatementNode extends ASTNode {
    public StatementNode(position pos) {
        super(pos);
    }

    @Override
    public String toString() {
        return "";
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
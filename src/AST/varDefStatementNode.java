package AST;

import Util.position;

import java.util.ArrayList;

public class varDefStatementNode extends ASTNode {
    public TypeNode type;
    public ArrayList<VarDefNode> variables = new ArrayList<>();

    public varDefStatementNode(position pos) {
        super(pos);
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
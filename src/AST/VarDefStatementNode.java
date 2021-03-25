package AST;

import Util.position;

import java.util.ArrayList;

public class VarDefStatementNode extends ASTNode {
    public TypeNode type;
    public ArrayList<VarDefNode> variables = new ArrayList<>();

    public VarDefStatementNode(position pos) {
        super(pos);
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
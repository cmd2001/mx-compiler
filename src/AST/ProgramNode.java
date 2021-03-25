package AST;

import Util.position;

import java.util.ArrayList;

public class ProgramNode extends ASTNode {
    public ArrayList<CompoundStatementNode> compoundStatements = new ArrayList<>();

    public ProgramNode(position pos) {
        super(pos);
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}

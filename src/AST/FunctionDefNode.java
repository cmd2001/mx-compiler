package AST;

import Util.position;
import Util.Type;

import java.util.ArrayList;

public class FunctionDefNode extends ASTNode {
    public ArrayList<StatementNode> stmts;
    public ArrayList<VariableNode> args;
    public Type retType;
    public FunctionDefNode(position pos) {
        super(pos);
        stmts = new ArrayList<>();
        args = new ArrayList<>();
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
package AST;

import Util.position;

import java.util.ArrayList;

public class ClassDefNode extends ASTNode {
    public String className;
    public ArrayList<FunctionDefNode> functions = new ArrayList<>();
    public ConstructFunctionDefNode constructFunction;
    public ArrayList<varDefStatementNode> variables = new ArrayList<>();

    public ClassDefNode(position pos, String className) {
        super(pos);
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
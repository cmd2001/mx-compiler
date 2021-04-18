package AST;

import Util.position;

import java.util.ArrayList;

public class FunctionDefNode extends ASTNode {
    public boolean isVoid = false;
    public TypeNode returnType;
    public ArrayList<TypeNode> argTypes = new ArrayList<>();
    public ArrayList<String> argNames = new ArrayList<>();
    public String funcName;
    public BlockNode funcBody;

    public FunctionDefNode(position pos) {
        super(pos);
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
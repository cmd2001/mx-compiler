package AST;

import Util.position;
import Util.Type;

import java.util.ArrayList;

public class FunctionDefNode extends ASTNode {
    public TypeNode returnType;
    public ArrayList<TypeNode> argTypes = new ArrayList<>();
    public ArrayList<String> argNames = new ArrayList<>();
    public String funcName;
    public BlockNode funcBody;

    public FunctionDefNode(position pos, TypeNode returnType, ArrayList<TypeNode> argTypes, ArrayList<String> argNames, String funcName, BlockNode funcBody) {
        super(pos);
        this.returnType = returnType;
        this.argTypes = argTypes;
        this.argNames = argNames;
        this.funcName = funcName;
        this.funcBody = funcBody;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
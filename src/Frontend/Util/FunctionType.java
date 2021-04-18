package Frontend.Util;

import AST.FunctionDefNode;
import AST.TypeNode;

import java.util.ArrayList;

public class FunctionType extends Type {
    public String name;
    public Type returnType;
    public ArrayList<TypeNode> argTypes;
    public ArrayList<String> argNames;

    public FunctionType(FunctionDefNode defNode, boolean isConstructor) {
        super(isConstructor ? Category.CONSTRUCTOR : Category.FUNC);
        this.name = defNode.funcName;
        returnType = defNode.isVoid ? new BasicType(Category.NULL) : new TypeBuilder().build(defNode.returnType);
        this.argTypes = defNode.argTypes;
        this.argNames = defNode.argNames;
    }
}

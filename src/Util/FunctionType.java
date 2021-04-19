package Util;

import AST.FunctionDefNode;

import java.util.HashMap;

public class FunctionType extends Type {
    public String name;
    public Type returnType;
    public HashMap<String, Variable> args = new HashMap<>();

    public FunctionType(FunctionDefNode defNode, boolean isConstructor) {
        super(isConstructor ? Category.CONSTRUCTOR : Category.FUNC);
        this.name = defNode.funcName;
        TypeBuilder builder = new TypeBuilder();
        returnType = defNode.isVoid ? new BasicType(Category.NULL) : builder.build(defNode.returnType);
        assert (defNode.argTypes.size() == defNode.argNames.size());
        for(int i = 0; i < defNode.argTypes.size(); i++) {
            String name = defNode.argNames.get(i);
            Type type = builder.build(defNode.argTypes.get(i));
            args.put(name, new Variable(type, name));
        }
    }
    public FunctionType(String name, Type returnType) {
        super(Category.FUNC);
        this.name = name;
        this.returnType = returnType;
    }
    public void addArg(Variable variable) { args.put(variable.name, variable); }
}

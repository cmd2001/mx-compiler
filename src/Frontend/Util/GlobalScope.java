package Frontend.Util;

import Util.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class GlobalScope extends Scope {
    private HashMap<String, Type> types = new HashMap<>();
    public GlobalScope() {
        super(null);

        position pos = new position(0, 0);

        // add basic types.
        Type nullInstance = new BasicType(Type.Category.NULL);
        Type intInstance = new BasicType(Type.Category.INT);
        Type boolInstance = new BasicType(Type.Category.BOOL);
        Type voidInstance = new BasicType(Type.Category.VOID);

        addType("null", nullInstance, pos);
        addType("int", intInstance, pos);
        addType("bool", boolInstance, pos);
        addType("void", voidInstance, pos);

        // add string
        ClassType stringInstance = new StringType();
        FunctionType func = new FunctionType("length", intInstance);
        stringInstance.defineFunction(func);
        func = new FunctionType("substring", stringInstance);
        func.addArg(new Variable(intInstance, "left"));
        func.addArg(new Variable(intInstance, "right"));
        stringInstance.defineFunction(func);
        func = new FunctionType("parseInt", intInstance);
        stringInstance.defineFunction(func);
        func = new FunctionType("ord", intInstance);
        func.addArg(new Variable(intInstance, "pos"));
        addType("string", stringInstance, pos);

        // add builtin functions
        func = new FunctionType("print", voidInstance);
        func.addArg(new Variable(stringInstance, "str"));
        defineFunction(func, pos);
        func = new FunctionType("println", voidInstance);
        func.addArg(new Variable(stringInstance, "str"));
        defineFunction(func, pos);
        func = new FunctionType("printInt", voidInstance);
        func.addArg(new Variable(intInstance, "n"));
        defineFunction(func, pos);
        func = new FunctionType("printlnInt", voidInstance);
        func.addArg(new Variable(intInstance, "n"));
        defineFunction(func, pos);
        func = new FunctionType("getString", stringInstance);
        defineFunction(func, pos);
        func = new FunctionType("getInt", intInstance);
        defineFunction(func, pos);
        func = new FunctionType("toString", stringInstance);
        func.addArg(new Variable(intInstance, "i"));
        defineFunction(func, pos);
    }

    public void addType(String name, Type type, position pos) {
        if(types.containsKey(name)) throw new syntaxError("Type/Class redefined", pos);
        if(hasVariable(name, false)) throw new syntaxError("Type/Class name same to a variable", pos);
        if(hasFunction(name, false)) throw new syntaxError("Type/Class name same to a function", pos);
        types.put(name, type);
    }
    public boolean hasType(String name) {
        return types.containsKey(name);
    }
    public Type getType(String name) {
        return types.get(name);
    }

    public Type getIntInstance() {
        return types.get("int");
    }
    public Type getBoolInstance() {
        return types.get("bool");
    }
    public Type getNullInstance() {
        return types.get("null");
    }
    public Type getVoidInstance() {
        return types.get("void");
    }
    public Type getStringInstance() {
        return types.get("string");
    }
}

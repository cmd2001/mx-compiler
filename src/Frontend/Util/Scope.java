package Frontend.Util;

import java.util.HashMap;
import Util.*;

public class Scope {
    private HashMap<String, FunctionType> functions; // variable and function can use same name.
    private HashMap<String, Variable> variables;
    private FunctionType constructor;
    private Scope parent;

    public Scope(Scope parent) { this.parent = parent; }
    public void defineFunction(FunctionType function, position pos) {
        if(functions.containsKey(function.name)) throw new syntaxError("Function Redefined", pos);
        functions.put(function.name, function);
    }
    public void defineVariable(Variable variable, position pos) {
        if(variables.containsKey(variable.name)) throw new syntaxError("Variable Redefined", pos);
        variables.put(variable.name, variable);
    }
    public void defineConstructor(FunctionType _constructor, position pos) {
        if(constructor != null) throw new syntaxError("Constructor Redefined", pos);
        constructor = _constructor;
    }

    public boolean hasFunction(String name, boolean rec) {
        if(functions.containsKey(name)) return true;
        if(rec && parent != null) return parent.hasFunction(name, rec);
        return false;
    }
    public boolean hasVariable(String name, boolean rec) {
        if(variables.containsKey(name)) return true;
        if(rec && parent != null) return parent.hasVariable(name, rec);
        return false;
    }
    public boolean hasConstructor(boolean rec) {
        if(constructor != null) return true;
        if(rec && parent != null) return parent.hasConstructor(rec);
        return false;
    }

    public FunctionType getFunction(String name) {
        return functions.get(name);
    }
    public Variable getVariable(String name) {
        return variables.get(name);
    }
    public FunctionType getConstructor() {
        return constructor;
    }
}

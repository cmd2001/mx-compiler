package Frontend.Util;

import java.util.HashMap;

public class ClassType extends Type {
    public String name;
    private HashMap<String, FunctionType> functions;
    private HashMap<String, Variable> variables;

    public ClassType(String name) { super(Category.CLASS); this.name = name; }
    public boolean hasFunction(String name) { return functions.containsKey(name); }
    public FunctionType getFunction(String name) { return functions.get(name); }
    public boolean hasVariable(String name) { return variables.containsKey(name); }
    public Variable getVariable(String name) { return variables.get(name); }
    public void defineFunction(FunctionType function) { functions.put(function.name, function); }
    public void defineVariable(Variable variable) { variables.put(variable.name, variable); }
}

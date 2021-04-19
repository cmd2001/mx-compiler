package Util;

import java.util.HashMap;

public class ClassType extends Type {
    public String name;
    Scope localScope;

    public ClassType(String name, Scope parent) { super(Category.CLASS); this.name = name; this.localScope = new Scope(parent); }
    public boolean hasFunction(String name) { return localScope.hasFunction(name, false); }
    public FunctionType getFunction(String name, boolean rec) { return localScope.getFunction(name, rec); }
    public boolean hasVariable(String name, boolean rec) { return localScope.hasVariable(name, rec); }
    public Variable getVariable(String name, boolean rec) { return localScope.getVariable(name, rec); }
    public void defineFunction(FunctionType function, position pos) { localScope.defineFunction(function, pos); }
    public void defineVariable(Variable variable, position pos) { localScope.defineVariable(variable, pos); }
    @Override
    public String toString() { return name; }
}

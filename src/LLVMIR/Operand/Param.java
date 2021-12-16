package LLVMIR.Operand;

import LLVMIR.TypeSystem.IRType;

public class Param extends Operand {
    public String name;
    public Param(IRType type, String name) { super(type); this.name = name; }
    public String toString() { return "%" + name; }
}

package LLVMIR.Operand;

import LLVMIR.TypeSystem.IRType;

public class Register extends Operand {
    public String name;
    public Register(IRType type, String name) {
        super(type);
        this.name = name;
    }
    @Override public String toString() { return "%" + name; }
}

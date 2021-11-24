package LLVMIR.Operand;

import LLVMIR.TypeSystem.IRType;

abstract public class Operand {
    public IRType type;
    public Operand(IRType type) { this.type = type; }
    abstract public String toString();
}

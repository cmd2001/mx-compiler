package LLVMIR.Operand;

import LLVMIR.Instruction.Inst;
import LLVMIR.TypeSystem.IRType;

public class Register extends Operand {
    public String name;
    public Inst def;
    public Register(IRType type, String name) {
        super(type);
        this.name = name;
    }
    @Override public String toString() { return "%" + name; }
}

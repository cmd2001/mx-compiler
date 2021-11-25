package LLVMIR.Operand;

import LLVMIR.TypeSystem.IRType;

public abstract class Constant extends Operand {
    public Constant(IRType type) { super(type); }
    @Override abstract public String toString();
}

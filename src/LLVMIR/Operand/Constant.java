package LLVMIR.Operand;

import LLVMIR.TypeSystem.IRType;

public abstract class Constant extends Operand {
    public Constant(IRType type) { super(type); }
    @Override abstract public String toString();
    @Override public boolean equals(Object o) { return this == o || (o.getClass() == this.getClass() && super.equals(o) && type.equals(((Constant) o).type)); }
}

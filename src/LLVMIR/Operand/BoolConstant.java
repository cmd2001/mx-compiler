package LLVMIR.Operand;

import LLVMIR.TypeSystem.IRIntegerType;

import java.util.Objects;

public class BoolConstant extends Constant {
    public int val;
    public BoolConstant(int val) { super(new IRIntegerType(1)); assert val == 0 || val == 1; this.val = val; }
    @Override public String toString() { return "" + val; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        BoolConstant that = (BoolConstant) o;
        return val == that.val;
    }

    @Override
    public int hashCode() {
        return Objects.hash(val);
    }
}

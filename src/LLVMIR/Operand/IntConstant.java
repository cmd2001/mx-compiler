package LLVMIR.Operand;

import LLVMIR.TypeSystem.IRIntType;

public class IntConstant extends Constant {
    public int val;
    public IntConstant(int val) { super(new IRIntType(32)); assert val == 0 || val == 1; this.val = val; }
    @Override public String toString() { return "" + val; }
}

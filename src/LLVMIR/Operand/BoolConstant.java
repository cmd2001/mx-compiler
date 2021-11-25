package LLVMIR.Operand;

import LLVMIR.TypeSystem.IRIntType;

public class BoolConstant extends Constant {
    public int val;
    public BoolConstant(int val) { super(new IRIntType(1)); assert val == 0 || val == 1; this.val = val; }
    @Override public String toString() { return "" + val; }
}

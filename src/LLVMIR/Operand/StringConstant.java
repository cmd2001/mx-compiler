package LLVMIR.Operand;

import LLVMIR.TypeSystem.IRArrayType;
import LLVMIR.TypeSystem.IRIntType;

public class StringConstant extends Constant {
    public String name;
    public String val;
    public StringConstant(String name, String val) {
        super(new IRArrayType(val.length(), new IRIntType(8)));
        this.name = name;
        this.val = val;
    }
    @Override public String toString() { return "@" + name; }
}

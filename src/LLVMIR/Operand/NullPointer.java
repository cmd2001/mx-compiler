package LLVMIR.Operand;

import LLVMIR.TypeSystem.IRPointerType;
import LLVMIR.TypeSystem.IRVoidType;
import com.sun.jdi.VoidType;

public class NullPointer extends Operand {
    public NullPointer() { super(new IRPointerType(new IRVoidType())); }
    @Override public String toString() { return "null"; }
}

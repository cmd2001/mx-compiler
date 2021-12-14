package LLVMIR.Instruction;

import LLVMIR.Block.IRBlock;
import LLVMIR.Operand.NullPointer;
import LLVMIR.Operand.Operand;
import LLVMIR.Operand.Register;

public class Cmp extends Inst {
    public enum CmpOpCategory {
        slt, sgt, sle, sge, eq, ne
    }
    private CmpOpCategory opCode;
    private Operand src1, src2;


    public Cmp(Operand src1, Operand src2, Register dest, CmpOpCategory opCode, IRBlock block) {
        super(dest, block);
        this.src1 = src1;
        this.src2 = src2;
        this.opCode = opCode;
    }
    @Override public boolean noSideEffect() { return true; }
    @Override public boolean isTerminal() { return false; }
        @Override
    public String toString() {
        String typeString;
        if (src1 instanceof NullPointer) {
            if (src2 instanceof NullPointer) typeString = "int*";
            else typeString = src2.type.toString();
        } else typeString = src1.type.toString();
        return dest.toString() + " = " + "icmp " + opCode.toString() + " " + typeString + " " +
                src1.toString()  + ", " + src2.toString();
    }
}

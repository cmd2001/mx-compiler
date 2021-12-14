package LLVMIR.Instruction;

import LLVMIR.Block.IRBlock;
import LLVMIR.Operand.Operand;
import LLVMIR.Operand.Register;
import LLVMIR.TypeSystem.IRIntType;

public class Zext extends Inst {
    private Operand origin;

    public Zext(Operand origin, Register dest, IRBlock block) {
        super(dest, block);
        this.origin = origin;
    }
    @Override
    public String toString() {
        String key = "zext";
        int org_size = origin.type.getBytes() * 8,
                dest_size = dest.type.getBytes() * 8;
        if (org_size > dest_size) key = "trunc";
        return dest.toString()  + " = " + key + " " + origin.type.toString() + " " + origin.toString() +
                " to " + dest.type.toString();
    }
    @Override public boolean noSideEffect() { return true; }
    @Override public boolean isTerminal() { return false; }
}

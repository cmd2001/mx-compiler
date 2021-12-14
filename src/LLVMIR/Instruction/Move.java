package LLVMIR.Instruction;

import LLVMIR.Block.IRBlock;
import LLVMIR.Operand.Operand;
import LLVMIR.Operand.Register;

public class Move extends Inst {
    private Operand origin;
    public Move(Operand origin, Register dest, IRBlock block) {
        super(dest, block);
        this.origin = origin;
    }
    @Override
    public boolean isTerminal() { return false; }
    @Override public boolean noSideEffect() { return true; }
    @Override
    public String toString() { return "mv " + origin.type.toString() + " " + dest.toString() + " " + origin.toString(); }
}

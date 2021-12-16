package LLVMIR.Instruction;

import LLVMIR.Block.IRBlock;

public class Jump extends Inst {
    public IRBlock jumpDest;

    public Jump(IRBlock jumpDest, IRBlock block) {
        super(null, block);
        this.jumpDest = jumpDest;
    }
    @Override public String toString() { return "br label %" + jumpDest.name; }
    @Override
    public boolean noSideEffect() { return false; }
    public boolean isTerminal() { return true; }
}

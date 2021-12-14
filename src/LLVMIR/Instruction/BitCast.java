package LLVMIR.Instruction;

import LLVMIR.Block.IRBlock;
import LLVMIR.Operand.Operand;
import LLVMIR.Operand.Register;

public class BitCast extends Inst {
    private Operand it;
    public BitCast(Operand it, Register dest, IRBlock block) {
        super(dest, block);
        this.it = it;
    }
    @Override public boolean isTerminal() { return false; }
    @Override
    public String toString() {
        return dest.toString() + " = bitcast " +
                it.type.toString() + " " + it.toString() + " to " + dest.type.toString();
    }
    @Override public boolean noSideEffect() { return true; }
}

package LLVMIR.Instruction;

import LLVMIR.Block.IRBlock;
import LLVMIR.Operand.Operand;
import LLVMIR.Operand.Register;

public class Malloc extends Inst {
    private Operand length;

    public Malloc(Operand length, Register dest, IRBlock block) {
        super(dest, block);
        this.length = length;
    }
        @Override
    public String toString() {
        return dest.toString() + " = call noalias i8* @malloc(" + length.type.toString() + " " + length.toString() + ")";
    }
    @Override public boolean noSideEffect() { return false; }
    @Override public boolean isTerminal() { return false; }

}

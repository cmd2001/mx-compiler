package LLVMIR.Instruction;

import LLVMIR.Block.IRBlock;
import LLVMIR.Operand.Operand;

public class Return extends Inst {
    private Operand value;

    public Return(IRBlock currentBlock, Operand value) {
        super(null, currentBlock);
        this.value = value;
    }
    @Override public boolean noSideEffect() { return false; }
    @Override public boolean isTerminal() { return true; }
    @Override
    public String toString() {
        return "ret" + (value == null ? " void" : (" " + value.type.toString() + " " + value.toString()));
    }

}

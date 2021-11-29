package LLVMIR.Instruction;

import LLVMIR.Block.IRBlock;
import LLVMIR.Operand.Register;

abstract public class Inst {
    public Register dest;
    public IRBlock block;
    public Inst prev, next;

    public Inst(Register dest, IRBlock block) {
        this.dest = dest;
        this.block = block;
    }

    public abstract boolean isTerminal();
    public abstract String toString();
    public abstract boolean noSideEffect();
}

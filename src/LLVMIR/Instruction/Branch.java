package LLVMIR.Instruction;

import LLVMIR.Block.IRBlock;
import LLVMIR.Operand.Operand;

public class Branch extends Inst {
    public Operand condition;
    public IRBlock trueDest, falseDest;

    public Branch(Operand condition, IRBlock trueDest, IRBlock falseDest, IRBlock block) {
        super(null, block);
        this.condition = condition;
        this.trueDest = trueDest;
        this.falseDest = falseDest;
    }
    @Override public boolean isTerminal() { return true; }
    @Override public String toString() {
        return "br " + condition.type.toString() + " " + condition.toString() + ", label %" +
                trueDest.name + ", label %" + falseDest.name;
    }
    @Override public boolean noSideEffect() { return false; }
}

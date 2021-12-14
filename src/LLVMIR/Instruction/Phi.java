package LLVMIR.Instruction;

import LLVMIR.Block.IRBlock;
import LLVMIR.Operand.Operand;
import LLVMIR.Operand.Register;

import java.util.ArrayList;

public class Phi extends Inst {
    private ArrayList<IRBlock> blocks;
    private ArrayList<Operand> values;

    public Phi(Register dest, ArrayList<IRBlock> blocks, ArrayList<Operand> values, IRBlock block) {
        super(dest, block);
        this.blocks = blocks;
        this.values = values;
    }
    @Override public boolean noSideEffect() { return false; }
    @Override public boolean isTerminal() { return false; }
    @Override
    public String toString() {
        StringBuilder ret = new StringBuilder(dest.toString() + " = phi " + dest.type.toString() + " ");
        for (int i = 0;i < values.size();i++) {
            if (i > 0) ret.append(", ");
            ret.append("[ ").append(values.get(i).toString());
            ret.append(", ").append("%").append(blocks.get(i).name).append(" ]");
        }
        return ret.toString();
    }
}

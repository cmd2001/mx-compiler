package LLVMIR.Instruction;

import LLVMIR.Block.IRBlock;
import LLVMIR.Operand.Operand;
import LLVMIR.Operand.Register;

public class Binary extends Inst { // todo: ASSIGN INST
    public enum BinaryOp { mul, sdiv, srem, add, sub, shl, ashr, and, xor, or };
    private BinaryOp op;
    private Operand src1, src2;

    public Binary(Operand src1, Operand src2, Register dest, BinaryOp op, IRBlock block) {
        super(dest, block);
        this.src1 = src1;
        this.src2 = src2;
        this.op = op;
        dest.def = this;
    }
    @Override public boolean isTerminal() { return false; }
    @Override public boolean noSideEffect() { return true; }
    @Override
    public String toString() {
        return dest.toString() + " = " + op.toString() + " " + src1.type.toString() + " " + src1.toString() + ", " + src2.toString();
    }
}

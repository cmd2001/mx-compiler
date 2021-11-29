package LLVMIR.Instruction;

import LLVMIR.Block.IRBlock;
import LLVMIR.Operand.Register;
import LLVMIR.TypeSystem.IRPointerType;

public class Alloc extends Inst {
    public Alloc(Register dest, IRBlock block) {
        super(dest, block);
        assert dest.type instanceof IRPointerType;
        dest.def = this;
    }

    @Override
    public String toString() {
        return dest.toString() + " = " + "alloca " + ((IRPointerType)dest.type).baseType.toString() + ", align " + ((IRPointerType)dest.type).baseType.getBytes();
    }

    @Override public boolean isTerminal() { return false; }
    @Override public boolean noSideEffect() { return false; }
}

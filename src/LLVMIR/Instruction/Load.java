package LLVMIR.Instruction;

import LLVMIR.Block.IRBlock;
import LLVMIR.Operand.Operand;
import LLVMIR.Operand.Register;

public class Load extends Inst {
    private Operand address;
    public Load(Register dest, Operand address, IRBlock block) {
        super(dest, block);
        this.address = address;
    }
    @Override public boolean isTerminal() { return false; }
    @Override public boolean noSideEffect() { return false; }
    @Override
    public String toString() {
        return "%" + dest.name + " = load " + dest.type.toString() + ", " +
                address.type.toString() + " " + address.toString() + ", align " +
                dest.type.getBytes() / 8;
    }
}

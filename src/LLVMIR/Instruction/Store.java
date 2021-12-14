package LLVMIR.Instruction;

import LLVMIR.Block.IRBlock;
import LLVMIR.Operand.NullPointer;
import LLVMIR.Operand.Operand;
import LLVMIR.TypeSystem.IRPointerType;

public class Store extends Inst {
    private Operand value;
    private Operand address;

    public Store(Operand address, Operand value, IRBlock block) {
        super(null, block);
        this.value = value;
        this.address = address;
    }
    @Override
    public String toString() {
        String vs = value.type.toString();
        if (value instanceof NullPointer) vs = ((IRPointerType)address.type).baseType.toString();
        return "store " + vs + " " + value.toString() + ", " +
                address.type.toString() + " " + address.toString() +
                ", align " + value.type.getBytes();
    }
    @Override public boolean noSideEffect() { return false; }
    @Override public boolean isTerminal() { return false; }
}

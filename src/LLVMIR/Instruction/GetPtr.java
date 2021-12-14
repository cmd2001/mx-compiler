package LLVMIR.Instruction;

import LLVMIR.Block.IRBlock;
import LLVMIR.Operand.IntConstant;
import LLVMIR.Operand.Operand;
import LLVMIR.Operand.Register;
import LLVMIR.TypeSystem.IRType;

public class GetPtr extends Inst {
    private Operand arrayOffset;
    private IntConstant elementOffset;
    private IRType type;
    private Operand ptr;

    public GetPtr(IRType type, Operand ptr, Operand arrayOffset,
                  IntConstant elementOffset, Register dest, IRBlock block) {
        super(dest, block);
        this.type = type;
        this.ptr = ptr;
        this.arrayOffset = arrayOffset;
        this.elementOffset = elementOffset; //this can be null
    }
    @Override
    public boolean isTerminal() { return false; }
    @Override
    public boolean noSideEffect() { return true; }
    @Override
    public String toString() {
        String arrayOffToStr = arrayOffset.type.toString() + " " + arrayOffset.toString();
        String elementOffToStr = elementOffset == null ? "" :
                ", " + elementOffset.type.toString() + " " + elementOffset.toString();
        return dest.toString() + " = getelementptr inbounds " + type.toString() + ", " +
                ptr.type.toString() + " " + ptr.toString() + ", " + arrayOffToStr + elementOffToStr;
    }
}

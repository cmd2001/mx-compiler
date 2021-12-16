package LLVMIR.Instruction;

import LLVMIR.Block.IRBlock;
import LLVMIR.Operand.Operand;
import LLVMIR.Operand.Register;
import LLVMIR.TypeSystem.IRFunctionType;

import java.util.ArrayList;

public class Call extends Inst {
    private IRFunctionType callee;
    private ArrayList<Operand> params;
    public Call(IRFunctionType callee, ArrayList<Operand> params, Register dest, IRBlock block) {
        super(dest, block);
        this.callee = callee;
        this.params = params;
    }
    @Override public boolean noSideEffect() { return false;}
    @Override
    public String toString() {
        StringBuilder ret = new StringBuilder();
        if (dest != null) {
            ret.append(dest.toString());
            ret.append(" = ");
            ret.append("call ");
            ret.append(dest.type.toString());
            ret.append(" ");
        } else ret.append("call void ");
        ret.append("@");
        ret.append(callee.name);
        if (params.size() == 0) ret.append("(");
        for (int i = 0;i < params.size();++i){
            ret.append((i == 0 ? "(" : ", "));
            String paramT = params.get(i).type.toString();
            if(paramT == "i1") paramT = "i8";
            ret.append(paramT);
            ret.append(" ");
            ret.append(params.get(i).toString());
        }
        ret.append(")");
        return ret.toString();
    }
    @Override public boolean isTerminal() { return false; }
}

package LLVMIR.Block;

import LLVMIR.Operand.Param;
import LLVMIR.Operand.Register;
import LLVMIR.TypeSystem.IRType;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Function {
    public String name;
    public IRType retType;
    public Param classPtr;
    public ArrayList<Param> parameters = new ArrayList<>();
    public IRBlock entryBlock = new IRBlock("entry"),
                    exitBlock;
    public HashSet<Function> callFunction = new HashSet<>();
    public HashSet<Register> allocaVar = new HashSet<>();
    public LinkedHashSet<IRBlock> blocks = new LinkedHashSet<>();
    public Function(String name) {
        this.name = name;
        blocks.add(entryBlock);
    }
    public void addCalleeFunction(Function callee) {
        callFunction.add(callee);
    }
    public boolean isCallee(Function fn) {
        return callFunction.contains(fn);
    }
    public void addBlock(IRBlock block) {
        blocks.add(block);
    }
    public void addParam(Param parameter){
        parameters.add(parameter);
    }
    public void setExitBlock(IRBlock exitBlock) {
        this.exitBlock = exitBlock;
    }

    public void addVar(Register var) {
        allocaVar.add(var);
    }
}

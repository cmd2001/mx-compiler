package LLVMIR.Block;

import LLVMIR.Instruction.*;
import LLVMIR.Operand.Register;

import java.util.ArrayList;
import java.util.HashMap;

public class IRBlock {
    public String name;
    public ArrayList<IRBlock> precursors = new ArrayList<>();
    public ArrayList<IRBlock> successors = new ArrayList<>();
    public Inst headInst = null, tailInst = null;
    public HashMap<Register, Phi>  PhiInst = new HashMap<>();
    public boolean terminated = false;
    public IRBlock(String name) { this.name = name; }
    public void addTailInst(Inst inst) {
        if (tailInst == null) headInst = tailInst = inst;
        else {
            tailInst.next = inst;
            inst.prev = tailInst;
            tailInst = inst;
        }
    }
    public void addHeadInst(Inst inst) {
        if (headInst == null) headInst = tailInst = inst;
        else {
            inst.next = headInst;
            headInst.prev = inst;
            headInst = inst;
        }
    }
    public void addInstBeforeTail(Inst inst) {
        Inst priorTail = tailInst.prev;
        if (priorTail == null) {
            headInst = inst;
            inst.prev = null;
            inst.next = tailInst;
            tailInst.prev = inst;
        }
        else {
            priorTail.next = inst;
            inst.next = tailInst;
            tailInst.prev = inst;
            inst.prev = priorTail;
        }
        inst.block = this;
    }
    public void addTerminalInst(Inst inst) {
        addTailInst(inst);
        terminated = true;
        IRBlock dest;
        if (inst instanceof Jump) {
            dest = ((Jump)inst).jumpDest;
            successors.add(dest);
            dest.precursors.add(this);
        } else if (inst instanceof Branch) {
            dest = ((Branch)inst).trueDest;
            successors.add(dest);
            dest.precursors.add(this);
            dest = ((Branch)inst).falseDest;
            successors.add(dest);
            dest.precursors.add(this);
        }
    }
    public boolean terminatedByReturn() {
        return terminated && this.tailInst instanceof Return;
    }
    public void addPhi(Phi inst) {
        PhiInst.put(inst.dest, inst);
    }
}

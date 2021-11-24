package LLVMIR.TypeSystem;

import java.util.ArrayList;

public class ClassType extends IRType {
    public String name;
    public ArrayList<IRType> memberList;
    public ClassType(String name, ArrayList<IRType> memberList) { this.name = name; this.memberList = memberList; }
    @Override
    public int getBytes() {
        int size = 0;
        for (IRType irType : memberList) size += (irType.getBytes() + 3) / 4 * 4;
        return size;
    }
    @Override()
    public String toString() { return "Class: " + name; }
    public int getOffset(int index) {
        int ret = 0;
        for (int i = 0; i < index; i++) ret += (memberList.get(i).getBytes() + 3) / 4 * 4;
        return ret;
    }
}

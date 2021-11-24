package LLVMIR.TypeSystem;

import LLVMIR.Operand.Operand;

abstract public class IRType {
    abstract public int getBytes();
    abstract public String toString();
    public boolean equals(Object obj) {
        return obj instanceof IRType && toString().equals(obj.toString());
    }
}

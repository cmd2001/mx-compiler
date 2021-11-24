package LLVMIR.TypeSystem;

public class ArrayType extends IRType {
    public int size;
    public IRType basicType;
    public ArrayType(int size, IRType basicType) { this.size = size; this.basicType = basicType; }
    @Override
    public int getBytes() { return basicType.getBytes() * size; }
    @Override
    public String toString() { return "[" + size + "x" + basicType.toString() + "]"; }
}

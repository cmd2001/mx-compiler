package LLVMIR.TypeSystem;

public class IRPointerType extends IRType {
    public IRType baseType;
    public IRPointerType(IRType baseType) { this.baseType = baseType; }
    @Override public int getBytes() { return 4; }
    @Override public String toString() { return baseType.toString() + "*"; }
}

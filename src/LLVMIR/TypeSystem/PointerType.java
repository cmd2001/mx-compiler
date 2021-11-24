package LLVMIR.TypeSystem;

public class PointerType extends IRType {
    public IRType baseType;
    public PointerType(IRType baseType) { this.baseType = baseType; }
    @Override
    public int getBytes() { return 4; }
    @Override
    public String toString() { return baseType.toString() + "*"; }
}

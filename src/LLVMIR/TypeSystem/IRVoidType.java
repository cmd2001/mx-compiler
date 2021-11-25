package LLVMIR.TypeSystem;

public class IRVoidType extends IRType {
    public IRVoidType() {}
    @Override public int getBytes() { return 0; }
    @Override public String toString() { return "void"; }
}

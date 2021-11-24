package LLVMIR.TypeSystem;

public class IntegerType extends IRType {
    public int width;
    public IntegerType(int width) { assert width == 1 || width == 8 || width == 32; this.width = width; }
    @Override
    public int getBytes() { return (width + 7) / 8; }
    @Override
    public String toString() { return "i" + width; }
}

package Util;

public class ArrayType extends ClassType {
    public Type basicType;
    public int dim;
    private static String genName(int dim, Type basicType) {
        Type t = basicType;
        while(t instanceof ArrayType) {
            t = ((ArrayType) t).basicType;
            dim++;
        }
        return t.toString() + "$Dim" + dim;
    }
    public ArrayType(int dim, Type basicType) {
        super(genName(dim, basicType), null);
        this.category = Category.ARRAY;
        this.dim = dim;
        this.basicType = basicType;
        defineFunction(new FunctionType("size", new BasicType(Category.INT)), new position(0, 0));
    }
    @Override
    public boolean equals(Type rhs) {
        if(!(rhs instanceof ArrayType)) return false;
        return this.category == rhs.category && this.basicType.equals(((ArrayType) rhs).basicType) && this.dim == ((ArrayType) rhs).dim;
    }
}

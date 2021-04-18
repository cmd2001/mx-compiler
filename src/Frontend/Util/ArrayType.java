package Frontend.Util;

public class ArrayType extends Type {
    Type basicType;
    public int dim;
    public ArrayType(int dim, Type basicType) { super(Category.ARRAY); this.dim = dim; this.basicType = basicType; }
}

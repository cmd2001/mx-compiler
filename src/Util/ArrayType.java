package Util;

public class ArrayType extends ClassType {
    Type basicType;
    public int dim;
    public ArrayType(int dim, Type basicType) {
        super("", null); // use class "" to present array, array type will never use parent scope.
        this.category = Category.ARRAY;
        this.dim = dim;
        this.basicType = basicType;
    }
}

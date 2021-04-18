package Frontend.Util;

public class ArrayType extends ClassType {
    Type basicType;
    public int dim;
    public ArrayType(int dim, Type basicType) {
        super(""); // use class "" to present array
        this.category = Category.ARRAY;
        this.dim = dim;
        this.basicType = basicType;
    }
}

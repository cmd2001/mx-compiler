package Util;

public class StringType extends ClassType {
    public StringType() { // string type will never use parent scope.
        super("string", null);
        this.category = Category.STRING;
    }
}

package Util;

public abstract class Type {
    public enum Category {
        NULL, INT, BOOL, STRING, ARRAY, CLASS, VOID, FUNC, CONSTRUCTOR
    }
    public Category category;
    Type(Category category) { this.category = category; }
    public boolean isNull() { return category == Category.NULL; }
    public boolean isInt() { return category == Category.INT; }
    public boolean isBool() { return category == Category.BOOL; }
    public boolean isString() { return category == Category.STRING; }
    public boolean isArray() { return category == Category.ARRAY; }
    public boolean isClass() { return category == Category.CLASS; }
    public boolean isVoid() { return category == Category.VOID; }
    public boolean isFunc() { return category == Category.FUNC; }
    public boolean isConstructor() { return category == Category.CONSTRUCTOR; }
    public String toString() {
        return switch (category) { // string has been override in ClassType.
            case NULL -> "null";
            case INT -> "int";
            case BOOL -> "bool";
            case VOID -> "void";
            default -> throw new IllegalStateException("Unexpected value: " + category);
        };
    }
    public boolean equals(Type rhs) {
        if(this instanceof ArrayType) {
            ArrayType t = (ArrayType) this;
            return t.equals(rhs);
        }
        return category == rhs.category;
    }
}

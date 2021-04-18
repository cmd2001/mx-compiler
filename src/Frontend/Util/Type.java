package Frontend.Util;

import AST.TypeNode;

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
}

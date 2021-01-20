// Type.java from ZYHowell/Yx

package Util;

import java.util.HashMap;

public class Type {
    public boolean isInt = false, isBool = false, isString = false, isNull = false, isVoid = false, isClass = false;
    public String className = "";
    public HashMap<String, Type> classMembers = null;

    @Override
    public String toString() {
        return "Type{" +
                "isInt=" + isInt +
                ", isBool=" + isBool +
                ", isString=" + isString +
                ", isNull=" + isNull +
                ", isVoid=" + isVoid +
                ", isClass=" + isClass +
                ", className='" + className + '\'' +
                ", classMembers=" + classMembers +
                '}';
    }
}

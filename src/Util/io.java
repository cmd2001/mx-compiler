package Util;

public class io {
    public static void debug(String t) {
        System.err.println(t);
    }
    public static void debug(int t) {
        System.err.println(t);
    }
    public static void debug(boolean t) {
        System.err.println(t);
    }
    public static void debug(Type t) { System.err.println(t.toString()); }
}

package Util;

public class internalError extends error {
    public internalError(String msg, position pos) {
        super("InternalError: " + msg, pos);
    }
}

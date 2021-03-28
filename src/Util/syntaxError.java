package Util;

public class syntaxError extends error {

    public syntaxError(String msg, position pos) {
        super("SyntaxError: " + msg, pos);
    }

}
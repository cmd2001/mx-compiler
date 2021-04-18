package Frontend.Util;

import java.util.HashMap;

public class GlobalScope extends Scope {
    private HashMap<String, Type> typeMap;
    public GlobalScope() { super(null); }
}

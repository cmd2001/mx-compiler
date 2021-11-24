package LLVMIR.TypeSystem;

import java.util.ArrayList;

public class FunctionType extends IRType {
    public IRType returnType;
    public ArrayList<IRType> parameterList;
    public FunctionType(IRType returnType, ArrayList<IRType> parameterList) { this.returnType = returnType; this.parameterList = parameterList; }
    @Override
    public int getBytes() { return 0; }
    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("Function: ").append(returnType.toString()).append(" (");
        for (int i = 0; i < parameterList.size(); i++) {
            string.append(parameterList.get(i).toString());
            if (i != parameterList.size() - 1)
                string.append(", ");
        }
        string.append(")\n");
        return string.toString();
    }
}

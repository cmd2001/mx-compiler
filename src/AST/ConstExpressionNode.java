package AST;

import Util.Type;
import Util.position;

public class ConstExpressionNode extends ASTNode {
    public boolean islogicConstant = false, isIntConstant = false, isStringConstant = false, isNull = false;
    public boolean logicConstant;
    public int intConstant;
    public String stringConstant;
    public Type valueType;
    public boolean isLeft;

    public ConstExpressionNode(position pos) {
        super(pos);
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
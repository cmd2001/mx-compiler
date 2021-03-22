package AST;

import Util.position;

public class BinaryExpressionNode extends ASTNode {
    public enum BianryOp {None, Mul, Div, Mod, Add, Sub, ShL, ShR, Less, Greater, LessEqual, GreaterEqual, Equal, NotEqual, And, Xor, Or, AndAnd, OrOr, Assign}
    public BianryOp op;
    public ExpressionNode src1, src2;

    public BinaryExpressionNode(position pos) {
        super(pos);
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
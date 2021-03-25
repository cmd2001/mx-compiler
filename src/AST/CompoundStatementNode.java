package AST;

import Util.position;

public class CompoundStatementNode extends ASTNode {
    public boolean isFuncDefStatement = false, isClassDefStatement = false, isVarDefStatement = false, isEmpty = false;
    public FunctionDefNode functionDefNode;
    public ClassDefNode classDefNode;
    public VarDefStatementNode varDefStatementNode;

    public CompoundStatementNode(position pos) {
        super(pos);
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}

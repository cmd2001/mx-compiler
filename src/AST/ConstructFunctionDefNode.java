package AST;

import Util.Type;
import Util.position;

public class ConstructFunctionDefNode extends ASTNode {
    public String constructionFunctionName;
    public BlockNode block;

    public ConstructFunctionDefNode(position pos) {
        super(pos);
    }


    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
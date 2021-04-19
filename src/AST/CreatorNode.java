package AST;

import Util.Type;
import Util.position;

public class CreatorNode extends ASTNode {
    public boolean isBasicCreator = false, isClassCreator = false, isArrayCreator = false;
    public BasicCreatorNode basicCreator;
    public ClassCreatorNode classCreator;
    public ArrayCreatorNode arrayCreator;
    public Type valueType;

    public CreatorNode(position pos) {
        super(pos);
    }


    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
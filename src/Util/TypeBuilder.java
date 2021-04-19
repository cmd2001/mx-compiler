package Util;

import AST.BasicTypeNode;
import AST.TypeNode;

public class TypeBuilder {
    Type build(BasicTypeNode basicTypeNode) {
        if(basicTypeNode.isInt) return new BasicType(Type.Category.INT);
        if(basicTypeNode.isBool) return new BasicType(Type.Category.BOOL);
        if(basicTypeNode.isIdentifier) return new ClassType(basicTypeNode.id);
        if(basicTypeNode.isString) return new StringType();
        throw new internalError("TypeBuilder.build(BasicTypeNode): TypeError", new position(0, 0));
    }
    Type build(TypeNode typeNode) {
        if(typeNode.isArrayType) return new ArrayType(typeNode.arrayDim, new TypeBuilder().build(typeNode.basicType));
        if(typeNode.isSimpleType) return build(typeNode.basicType);
        throw new internalError("TypeBuilder.build(TypeNode): TypeError", new position(0, 0));
    }
}

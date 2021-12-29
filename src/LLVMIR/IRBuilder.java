package LLVMIR;

import AST.*;
import LLVMIR.Block.Function;
import LLVMIR.Block.IRBlock;
import LLVMIR.Instruction.Jump;
import LLVMIR.Instruction.Return;
import LLVMIR.Operand.Operand;
import LLVMIR.TypeSystem.IRClassType;
import Util.GlobalScope;
import Util.position;

import java.util.ArrayList;
import java.util.HashMap;

public class IRBuilder implements ASTVisitor {

    private static class logicalPhi{
        ArrayList<Operand> values = new ArrayList<>();
        ArrayList<IRBlock> blocks = new ArrayList<>();
    }

    private boolean isParam;
    private GlobalScope gScope;
    private position beginning = new position(0, 0);
    private IRClassType currentClass = null;
    private Function currentFunction = null;
    private IRBlock currentBlock = null;
    private int symbolCtr = 0;
    private ArrayList<Return> returnList = new ArrayList<>();
    private HashMap<IRBlock, logicalPhi> logicalPhiMap = new HashMap<>();
    private boolean set_operand;

    IRBuilder() {
        isParam = false;
        this.gScope = gScope;
    }

    @Override
    public void visit(ASTNode it) {
        throw new RuntimeException("This should never be called");
    }

    @Override
    public void visit(ProgramNode it) {

    }

    @Override
    public void visit(CompoundStatementNode it) {

    }

    @Override
    public void visit(FunctionDefNode it) {

    }

    @Override
    public void visit(StatementNode it) {

    }

    @Override
    public void visit(ClassDefNode it) {

    }

    @Override
    public void visit(ConstructFunctionDefNode it) {

    }

    @Override
    public void visit(SimpleStatementNode it) {

    }

    @Override
    public void visit(ExpressionNode it) {
    }

    @Override
    public void visit(BlockNode it) {
        for (var statement: it.statements) {
            statement.accept(this);
            if (currentBlock.terminated) return;
        }
    }

    @Override
    public void visit(IfNode it) {
        IRBlock thenBlock = new IRBlock("if_then"),
                elseBlock = new IRBlock("if_else"),
                destBlock = new IRBlock("if_terminal");
        if (it.elseStatement == null) elseBlock = destBlock;
        it.expression.accept(this);
        currentBlock = thenBlock;
        it.ifStatement.accept(this);
        if (!currentBlock.terminated) currentBlock.addTerminalInst(new Jump(destBlock, currentBlock));
        if (it.elseStatement != null) {
            currentBlock = elseBlock;
            it.elseStatement.accept(this);
            if (!currentBlock.terminated) currentBlock.addTerminalInst(new Jump(destBlock, currentBlock));
        }
        if (thenBlock.terminatedByReturn() && elseBlock.terminatedByReturn()) return;
        currentBlock = destBlock;
    }

    @Override
    public void visit(WhileNode it) {
        IRBlock bodyBlock = new IRBlock("while_body"),
                destBlock = new IRBlock("while_dest"),
                condBlock = new IRBlock("while_cond");
        if (it.expression != null) {
            currentBlock.addTerminalInst(new Jump(condBlock, currentBlock));
            currentBlock = condBlock;
            it.expression.accept(this);
        } else {
            currentBlock.addTerminalInst(new Jump(bodyBlock, currentBlock));
            condBlock = bodyBlock;
        }
        currentBlock = bodyBlock;
        it.statement.accept(this);
        if (!currentBlock.terminated) currentBlock.addTerminalInst(new Jump(condBlock, currentBlock));
        currentBlock = destBlock;
    }

    @Override
    public void visit(ForNode it) {
        IRBlock bodyBlock = new IRBlock("for_body"),
                destBlock = new IRBlock("for_dest"),
                condBlock = new IRBlock("for_cond"),
                incrBlock = new IRBlock("for_incr");
        if (it.forStatement1 != null) it.forStatement1.accept(this);
        if (it.forExpression != null){
            currentBlock.addTerminalInst(new Jump(condBlock, currentBlock));
            currentBlock = condBlock;
            it.forExpression.accept(this);
        }
        else {
            currentBlock.addTerminalInst(new Jump(bodyBlock, currentBlock));
            condBlock = bodyBlock;
        }
        currentBlock = bodyBlock;
        it.forStatement.accept(this);
        if (!currentBlock.terminated) currentBlock.addTerminalInst(new Jump(incrBlock, currentBlock));
        currentBlock = incrBlock;
        if(it.forStatement3 != null) it.forStatement3.accept(this);
        if (!currentBlock.terminated) currentBlock.addTerminalInst(new Jump(condBlock, currentBlock));
        currentBlock = destBlock;
    }

    @Override
    public void visit(PostfixExpressionNode it) {

    }

    @Override
    public void visit(NewExpressionNode it) {

    }

    @Override
    public void visit(MemberExpressionNode it) {

    }

    @Override
    public void visit(FuncCallExpressionNode it) {

    }

    @Override
    public void visit(SubscriptExpressionNode it) {

    }

    @Override
    public void visit(PrefixExpressionNode it) {

    }

    @Override
    public void visit(BinaryExpressionNode it) {

    }

    @Override
    public void visit(SubExpressionNode it) {

    }

    @Override
    public void visit(ThisExpressionNode it) {

    }

    @Override
    public void visit(ConstExpressionNode it) {

    }

    @Override
    public void visit(IdExpressionNode it) {

    }

    @Override
    public void visit(CreatorNode it) {

    }

    @Override
    public void visit(VarDefStatementNode it) {

    }
}

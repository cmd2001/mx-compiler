import AST.ProgramNode;
import Frontend.SemanticChecker;
import Util.error;

import Util.mxErrorListener;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import Parser.mxLexer;
import Parser.mxParser;

import Frontend.ASTBuilder;

import java.io.FileInputStream;
import java.io.InputStream;


public class Main {
    public static void main(String[] args) throws Exception {
        // InputStream input = new FileInputStream("/Users/xzy/Desktop/Compiler-2021-testcases/sema/basic-package/basic-56.mx");
        InputStream input = System.in;
        try {
            mxLexer lexer = new mxLexer(CharStreams.fromStream(input));
            lexer.removeErrorListeners();
            lexer.addErrorListener(new mxErrorListener());
            mxParser parser = new mxParser(new CommonTokenStream(lexer));
            parser.removeErrorListeners();
            parser.addErrorListener(new mxErrorListener());
            ParseTree parseTreeRoot = parser.program();
            ASTBuilder astBuilder = new ASTBuilder();
            ProgramNode ASTRoot = (ProgramNode) astBuilder.visit(parseTreeRoot);
            new SemanticChecker().visit(ASTRoot);
        } catch (error er) {
            System.err.println(er.toString());
            throw new RuntimeException();
        }
    }
}

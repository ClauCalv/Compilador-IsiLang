package br.edu.ufabc.compiladores.isilang;

import br.edu.ufabc.compiladores.isilang.antlr4gen.IsiLangLexer;
import br.edu.ufabc.compiladores.isilang.antlr4gen.IsiLangParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Hello world!
 *
 */
public class Main {

    public static void main(String[] args) throws IOException {
        String inputFile = null;
        if ( args.length>0 )
            inputFile = args[0];
        InputStream is = System.in;
        if ( inputFile!=null )
            is = new FileInputStream(inputFile);
        ANTLRInputStream input = new ANTLRInputStream(is);

        IsiLangLexer lexer = new IsiLangLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        IsiLangParser parser = new IsiLangParser(tokens);
        ParseTree tree = parser.prog();

        IsiLangJavaVisitor eval = new IsiLangJavaVisitor("IsiCode");
        eval.visit(tree);
        String finaltext = eval.getFinalText();

        // TODO print finalText somewhere
    }

}

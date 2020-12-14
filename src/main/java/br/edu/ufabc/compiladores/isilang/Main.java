package br.edu.ufabc.compiladores.isilang;

import br.edu.ufabc.compiladores.isilang.antlr4gen.IsiLangLexer;
import br.edu.ufabc.compiladores.isilang.antlr4gen.IsiLangParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Hello world!
 *
 */
public class Main {

    public static void main(final String[] args) throws IOException {
        if (args.length > 0) {
            throw new IllegalArgumentException("Envie um caminho de arquivo como argumento!");
        }
        final Path inputFile = Path.of(args[0]).toAbsolutePath();
        final String fileName = inputFile.getFileName()
                                         .toString();

        final InputStream is = new FileInputStream(inputFile.toString());
        final ANTLRInputStream input = new ANTLRInputStream(is);

        IsiLangLexer lexer = new IsiLangLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        IsiLangParser parser = new IsiLangParser(tokens);
        ParseTree tree = parser.prog();

        IsiLangJavaVisitor eval = new IsiLangJavaVisitor(fileName);
        eval.visit(tree);
        String finaltext = eval.getFinalText();

        final Path finalPath = Path.of(inputFile.subpath(0, inputFile.getNameCount() - 2)
                                         .toString() + "/" + fileName.split("\\.")[0] + ".java");
        Files.write(finalPath, finaltext.getBytes());
    }
}

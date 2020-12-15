package br.edu.ufabc.compiladores.isilang;

import br.edu.ufabc.compiladores.isilang.antlr4gen.IsiLangLexer;
import br.edu.ufabc.compiladores.isilang.antlr4gen.IsiLangParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {

    public static void main(final String[] args) throws IOException {

//        if (args.length == 0) {
//            throw new IllegalArgumentException("Envie um caminho de arquivo como argumento!");
//        }
        final Path inputFile = Path.of("C:\\Users\\victo\\Documents\\UFABC\\COMPILADORES\\Compilador-IsiLang\\programa_base.isi").toAbsolutePath();
        System.out.println(inputFile);
        final String fileName = inputFile.getFileName()
                                         .toString()
                                         .split("\\.")[0];

        final InputStream is = new FileInputStream(inputFile.toString());
        final CharStream charStream = CharStreams.fromStream(is);

        final IsiLangLexer lexer = new IsiLangLexer(charStream);
        final CommonTokenStream tokens = new CommonTokenStream(lexer);
        final IsiLangParser parser = new IsiLangParser(tokens);
        ParseTree tree = parser.prog();

        final IsiLangJavaVisitor eval = new IsiLangJavaVisitor(fileName);
        eval.visit(tree);
        final String finalText = eval.getFinalText();

        final Path finalPath = Path.of(fileName.split("\\.")[0] + ".java");
        Files.write(finalPath, finalText.getBytes());
    }
}

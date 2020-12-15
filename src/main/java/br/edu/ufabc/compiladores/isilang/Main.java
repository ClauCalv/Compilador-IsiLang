package br.edu.ufabc.compiladores.isilang;

import br.edu.ufabc.compiladores.isilang.antlr4gen.IsiLangLexer;
import br.edu.ufabc.compiladores.isilang.antlr4gen.IsiLangParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {

    public static void main(final String[] args) throws IOException {
        if (args == null || args.length == 0) {
            throw new IllegalArgumentException("Você deve enviar pelo menos uma pasta como argumento!");
        }
        final Path file = Path.of(args[0]).toAbsolutePath();

        System.out.println(file);

        if (file.toFile().isDirectory()) {
            Files.list(file)
                 .forEach(Main::compile);
            return;
        }

        compile(file);
    }

    private static void compile(final Path inputFile) {
        try {
            System.out.println("Compilando arquivo: " + inputFile);
            final String fileName = inputFile.getFileName()
                                             .toString()
                                             .split("\\.")[0];
            final String finalText = compileImpl(inputFile, fileName);
            saveFinalText(fileName, finalText);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static String compileImpl(final Path inputFile,
                                      final String fileName) throws IOException {
        final IsiLangLexer lexer = new IsiLangLexer(CharStreams.fromStream(new FileInputStream(inputFile.toString())));
        final CommonTokenStream tokens = new CommonTokenStream(lexer);
        final IsiLangParser parser = new IsiLangParser(tokens);
        final ParseTree tree = parser.prog();

        final IsiLangJavaVisitor eval = new IsiLangJavaVisitor(fileName);
        eval.visit(tree);
        final String finalText = eval.getFinalText();
        return finalText;
    }

    private static void saveFinalText(final String fileName,
                                      final String finalText) throws IOException {
        final Path finalPath = Path.of(fileName.split("\\.")[0] + ".java");
        Files.write(finalPath, finalText.getBytes());
        System.out.println("Arquivo compilado e salvo em " + finalPath);
    }
}

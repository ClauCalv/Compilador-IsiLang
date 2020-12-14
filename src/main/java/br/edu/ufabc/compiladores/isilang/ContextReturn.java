package br.edu.ufabc.compiladores.isilang;

public class ContextReturn {

    public final Variable.VariableType type;
    public final String translationJava;

    public ContextReturn(Variable.VariableType type, String tranlationJava) {
        this.type = type;
        this.translationJava = tranlationJava;
    }
}

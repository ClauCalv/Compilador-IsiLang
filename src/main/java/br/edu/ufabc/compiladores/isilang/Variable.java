package br.edu.ufabc.compiladores.isilang;

public class Variable {
    public final String name;

    public VariableState state;
    public VariableType type;

    public Variable(String name) {
        this.name = name;
        this.type = VariableType.UNKNOWN;
        this.state = VariableState.NOT_INITIALIZED;
    }

    public VariableState getState() {
        return state;
    }

    public VariableType getType() {
        return type;
    }

    public boolean setType(VariableType type) {
        if(state == VariableState.INITIALIZED)
            return false;
        this.type = type;
        this.state = VariableState.INITIALIZED;
        return true;
    }

    enum VariableState {
        NOT_INITIALIZED, INITIALIZED
    }

    enum VariableType {
        TEXT("String", "char[]"), NUMERIC("double", "double"), LOGIC("boolean", "bool"), UNKNOWN("#UNKNOWN#", "#UNKNOWN#");

        private final String java, c;

        VariableType(String java, String c) {
            this.java = java;
            this.c = c;
        }

        public String toJava() {
            return java;
        }

        public String toC(){
            return c;
        }
    }
}

package br.edu.ufabc.compiladores.isilang;

public class Variable {
    public final String name;

    public VariableState state;
    public VariableType type;
    public final String initializer;

    public Variable(String name) {
        this.name = name;
        this.type = VariableType.UNKNOWN;
        this.state = VariableState.NOT_INITIALIZED;
        this.initializer = null;
    }

    public Variable(String name, String initializer) {
        this.name = name;
        this.type = VariableType.UNKNOWN;
        this.state = VariableState.NOT_INITIALIZED;
        this.initializer = initializer;
    }

    public VariableState getState() {
        return state;
    }

    public VariableType getType() {
        return type;
    }

    public boolean setType(VariableType type) {
        if(state == VariableState.INITIALIZED)
            return this.type == type;
        this.type = type;
        this.state = VariableState.INITIALIZED;
        return true;
    }

    enum VariableState {
        NOT_INITIALIZED, INITIALIZED
    }

    enum VariableType {
        TEXT("String"),
        NUMERIC("double"),
        LOGIC("boolean"),
        UNKNOWN("#UNKNOWN#");

        private final String java;

        VariableType(String java) {
            this.java = java;
        }

        public String toJava() {
            return java;
        }
    }
}

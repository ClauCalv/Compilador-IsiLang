package br.edu.ufabc.compiladores.isilang;

import java.util.ArrayList;
import java.util.List;

public class Command {

    private String command;
    private List<Command> nestedCommands = null;
    public final boolean isNested;

    public Command(String a) {
        command = a;
        isNested = false;
    }

    public Command(List<Command> nested) {
        nestedCommands = nested;
        isNested = true;
    }

    public static Command fromList(List<String> commands){
        List<Command> commandList = new ArrayList<Command>();
        for (String command : commands)
            commandList.add(new Command(command));
        return new Command(commandList);
    }


    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public List<Command> getNestedCommands() {
        return nestedCommands;
    }

    public void setNestedCommands(List<Command> nestedCommands) {
        this.nestedCommands = nestedCommands;
    }
}

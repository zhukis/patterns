package behavioral.command.quizfulexample.invoker;

import behavioral.command.quizfulexample.commands.Command;

import java.util.ArrayList;

public class ManagerCommands {
    private ArrayList<Command> listCommands = new ArrayList<>();

    public void addCommand(Command command) {
        listCommands.add(command);
    }

    public void run() {
        for (Command command : listCommands) {
            command.execute();
        }
    }
}

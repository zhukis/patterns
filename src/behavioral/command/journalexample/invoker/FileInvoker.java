package behavioral.command.journalexample.invoker;

import behavioral.command.journalexample.commands.Command;

public class FileInvoker {
    public Command command;

    public FileInvoker(Command command) {
        this.command = command;
    }

    public void execute() {
        command.execute();
    }
}

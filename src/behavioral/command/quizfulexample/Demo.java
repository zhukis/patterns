package behavioral.command.quizfulexample;

import behavioral.command.quizfulexample.commands.AddStringBegin;
import behavioral.command.quizfulexample.commands.AddStringEnd;
import behavioral.command.quizfulexample.commands.Command;
import behavioral.command.quizfulexample.commands.InsertStringCommand;
import behavioral.command.quizfulexample.invoker.ManagerCommands;
import behavioral.command.quizfulexample.receiver.Document;

public class Demo {
    public static void main(String[] args) {
        String textBefore = "before-";
        String textAfter = "-after";
        String insert = "insert";
        Document document = new Document();

        Command addBefore = new AddStringBegin(document, textBefore);
        Command addAfter = new AddStringEnd(document, textAfter);
        Command insertStr = new InsertStringCommand(document, insert, 2);

        ManagerCommands manager = new ManagerCommands();

        manager.addCommand(addBefore);
        manager.addCommand(addAfter);
        manager.addCommand(insertStr);

        manager.run();
    }
}

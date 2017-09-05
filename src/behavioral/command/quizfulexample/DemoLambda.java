package behavioral.command.quizfulexample;

import behavioral.command.quizfulexample.invoker.ManagerCommands;
import behavioral.command.quizfulexample.receiver.Document;

public class DemoLambda {
    public static void main(String[] args) {
        String textBefore= "before-";
        String textAfter= "-after";
        String insert= "insert";
        Document document= new Document();

        ManagerCommands manager = new ManagerCommands();

        manager.addCommand(() -> {
            document.addStringBefore(textBefore);
            document.output("Add string (" + textBefore + ") fore document");
        });

        manager.addCommand(() -> {
            document.addStringAfter(textAfter);
            document.output("Add string ("+ textAfter+") after document");
        });

        manager.addCommand(() -> {
            document.insertString(insert, 2);
            document.output("Insert string ("+ insert+")to position "+ 2);
        });

        manager.run();
    }
}

package behavioral.command.quizfulexample.commands;

import behavioral.command.quizfulexample.receiver.Document;

public class AddStringBegin implements Command {
    private Document document;
    private String str;

    public AddStringBegin(Document document, String str) {
        this.document = document;
        this.str = str;
    }

    @Override
    public void execute() {
        document.addStringBefore(str);
        document.output("Add string (" + str + ") before document");
    }
}

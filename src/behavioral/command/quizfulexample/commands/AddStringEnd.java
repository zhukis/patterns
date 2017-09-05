package behavioral.command.quizfulexample.commands;

import behavioral.command.quizfulexample.receiver.Document;

public class AddStringEnd implements Command {
    private Document document;
    private String str;

    public AddStringEnd(Document document, String str) {
        this.document = document;
        this.str = str;
    }

    @Override
    public void execute() {
        document.addStringAfter(str);
        document.output("Add string ("+ str+") after document");
    }
}

package behavioral.command.bookexample.commands;

import behavioral.command.bookexample.editor.Editor;

public abstract class Command {
    Editor editor;
    protected String backup;

    public Command(Editor editor) {
        this.editor = editor;
    }

    protected void backup() {
        backup = editor.textField.getText();
    }

    public void undo() {
        editor.textField.setText(backup);
    }

    public abstract Boolean execute();
}

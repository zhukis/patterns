package behavioral.command.bookexample.commands;

import behavioral.command.bookexample.editor.Editor;

public class CopyCommand extends Command {
    public CopyCommand(Editor editor) {
        super(editor);
    }

    @Override
    public Boolean execute() {
        editor.clipboard = editor.textField.getSelectedText();
        return false;
    }
}

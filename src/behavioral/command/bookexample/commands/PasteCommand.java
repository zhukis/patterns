package behavioral.command.bookexample.commands;

import behavioral.command.bookexample.editor.Editor;

public class PasteCommand extends Command {
    public PasteCommand(Editor editor) {
        super(editor);
    }

    @Override
    public Boolean execute() {
        if (editor.clipboard.isEmpty()) return false;

        backup();
        editor.textField.append(editor.clipboard);
        return true;
    }
}

package creation.abstractfactory.bookexample2.factories;

import creation.abstractfactory.bookexample2.buttons.Button;
import creation.abstractfactory.bookexample2.buttons.WindowButton;
import creation.abstractfactory.bookexample2.checkboxes.Checkbox;
import creation.abstractfactory.bookexample2.checkboxes.WindowCheckbox;

public class WindowsFactory implements GUIFactory {
    public Button createButton() {
        return new WindowButton();
    }

    public Checkbox createCheckbox() {
        return new WindowCheckbox();
    }
}

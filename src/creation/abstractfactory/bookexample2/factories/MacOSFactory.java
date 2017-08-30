package creation.abstractfactory.bookexample2.factories;

import creation.abstractfactory.bookexample2.buttons.Button;
import creation.abstractfactory.bookexample2.buttons.MacOSButton;
import creation.abstractfactory.bookexample2.checkboxes.Checkbox;
import creation.abstractfactory.bookexample2.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {
    public Button createButton() {
        return new MacOSButton();
    }

    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}

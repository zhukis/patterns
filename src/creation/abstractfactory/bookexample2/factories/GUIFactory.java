package creation.abstractfactory.bookexample2.factories;

import creation.abstractfactory.bookexample2.buttons.Button;
import creation.abstractfactory.bookexample2.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}

package creation.abstractfactory.bookexample.abstractfactory;

import creation.abstractfactory.bookexample.product.buttons.Button;
import creation.abstractfactory.bookexample.product.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}

package creation.abstractfactory.bookexample.abstractfactory;

import creation.abstractfactory.bookexample.product.buttons.Button;
import creation.abstractfactory.bookexample.product.buttons.WinButton;
import creation.abstractfactory.bookexample.product.checkboxes.Checkbox;
import creation.abstractfactory.bookexample.product.checkboxes.WinCheckbox;

public class WinFactory implements GUIFactory {
    public Button createButton() {
        return new WinButton();
    }

    public Checkbox createCheckbox() {
        return new WinCheckbox();
    }
}

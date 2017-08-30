package creation.abstractfactory.bookexample.abstractfactory;

import creation.abstractfactory.bookexample.product.buttons.Button;
import creation.abstractfactory.bookexample.product.buttons.OSXButton;
import creation.abstractfactory.bookexample.product.checkboxes.Checkbox;
import creation.abstractfactory.bookexample.product.checkboxes.OSXCheckbox;

public class OSXFactory implements GUIFactory {
    public Button createButton() {
        return new OSXButton();
    }

    public Checkbox createCheckbox() {
        return new OSXCheckbox();
    }
}

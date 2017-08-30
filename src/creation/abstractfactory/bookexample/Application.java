package creation.abstractfactory.bookexample;

import creation.abstractfactory.bookexample.abstractfactory.GUIFactory;
import creation.abstractfactory.bookexample.abstractfactory.OSXFactory;
import creation.abstractfactory.bookexample.abstractfactory.WinFactory;
import creation.abstractfactory.bookexample.product.buttons.Button;
import creation.abstractfactory.bookexample.product.checkboxes.Checkbox;

import java.util.Random;

public class Application {
    Button button;
    Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void perform() {
        button.paint();
        checkbox.paint();
    }
}

package creation.abstractfactory.bookexample2.app;

import creation.abstractfactory.bookexample2.buttons.Button;
import creation.abstractfactory.bookexample2.checkboxes.Checkbox;
import creation.abstractfactory.bookexample2.factories.GUIFactory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}

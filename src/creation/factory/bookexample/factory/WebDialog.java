package creation.factory.bookexample.factory;

import creation.factory.bookexample.product.Button;
import creation.factory.bookexample.product.HTMLButton;

public class WebDialog extends Dialog {
    public Button createButton() {
        return new HTMLButton();
    }
}

package creation.factory.bookexample2.factory;

import creation.factory.bookexample2.product.Button;
import creation.factory.bookexample2.product.WindowButton;

public class WindowDialog extends Dialog {
    public Button createButton() {
        return new WindowButton();
    }
}

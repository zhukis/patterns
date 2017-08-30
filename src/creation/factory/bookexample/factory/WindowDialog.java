package creation.factory.bookexample.factory;

import creation.factory.bookexample.product.Button;
import creation.factory.bookexample.product.WindowButton;

public class WindowDialog extends Dialog {
    public Button createButton() {
        return new WindowButton();
    }
}

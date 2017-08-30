package creation.factory.bookexample2.factory;

import creation.factory.bookexample2.product.Button;
import creation.factory.bookexample2.product.HtmlButton;

public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}

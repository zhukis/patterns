package creation.factory.bookexample2.factory;

import creation.factory.bookexample2.product.Button;

public abstract class Dialog {
    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();
}

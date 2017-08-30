package creation.factory.bookexample.factory;

import creation.factory.bookexample.product.Button;

public abstract class Dialog {
    public void renderWindow() {
        Button okButton = createButton();
        okButton.onClick("close dialog");
        okButton.render();
    }

    public abstract Button createButton();
}

package creation.factory.bookexample;

import creation.factory.bookexample.factory.Dialog;
import creation.factory.bookexample.factory.WebDialog;
import creation.factory.bookexample.factory.WindowDialog;
import creation.factory.bookexample.product.Button;

import java.util.Random;

public class ClientApplication {
    private static Dialog dialog;

    static {
        Random rand = new Random();
        if (rand.nextInt(2) < 1) {
            dialog = new WindowDialog();
        } else {
            dialog = new WebDialog();
        }
    }

    public static void main(String[] args) {
        Button button = dialog.createButton();
        button.render();
    }
}

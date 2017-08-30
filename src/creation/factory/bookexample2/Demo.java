package creation.factory.bookexample2;

import creation.factory.bookexample2.factory.Dialog;
import creation.factory.bookexample2.factory.HtmlDialog;
import creation.factory.bookexample2.factory.WindowDialog;

public class Demo {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}

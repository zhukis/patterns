package creation.abstractfactory.bookexample2;

import creation.abstractfactory.bookexample2.app.Application;
import creation.abstractfactory.bookexample2.factories.GUIFactory;
import creation.abstractfactory.bookexample2.factories.MacOSFactory;
import creation.abstractfactory.bookexample2.factories.WindowsFactory;

public class Demo {
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();

        if (osName.contains("mac")) {
            factory = new MacOSFactory();
            app = new Application(factory);
        } else {
            factory = new WindowsFactory();
            app = new Application(factory);
        }

        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}

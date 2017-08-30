package creation.abstractfactory.bookexample.product;

import creation.abstractfactory.bookexample.Application;
import creation.abstractfactory.bookexample.abstractfactory.OSXFactory;
import creation.abstractfactory.bookexample.abstractfactory.WinFactory;

import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        Random rand = new Random();
        Application application;

        if (rand.nextInt(10) < 5)
            application = new Application(new OSXFactory());
        else
            application = new Application(new WinFactory());

        application.perform();
    }
}

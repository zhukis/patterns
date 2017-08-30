package creation.abstractfactory.tutorialspoint;

import creation.abstractfactory.tutorialspoint.factories.AbstractFactory;
import creation.abstractfactory.tutorialspoint.factories.GoogleFactory;
import creation.abstractfactory.tutorialspoint.factories.ShapeFactory;

import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        Random rand = new Random();
        AbstractFactory factory;

        if (rand.nextInt(10) < 5) {
            factory = new ShapeFactory();
        } else {
            factory = new GoogleFactory();
        }

        factory.getColor("qwert").fill();
        factory.getShape("qwert").draw();
    }
}

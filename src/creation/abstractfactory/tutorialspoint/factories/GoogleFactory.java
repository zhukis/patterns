package creation.abstractfactory.tutorialspoint.factories;

import creation.abstractfactory.tutorialspoint.colors.Blue;
import creation.abstractfactory.tutorialspoint.colors.Color;
import creation.abstractfactory.tutorialspoint.shapes.Rectangle;
import creation.abstractfactory.tutorialspoint.shapes.Shape;

public class GoogleFactory implements AbstractFactory {
    public Shape getShape(String shape) {
        return new Rectangle();
    }

    public Color getColor(String color) {
        return new Blue();
    }
}

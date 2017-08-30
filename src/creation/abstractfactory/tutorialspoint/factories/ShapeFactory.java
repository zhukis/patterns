package creation.abstractfactory.tutorialspoint.factories;

import creation.abstractfactory.tutorialspoint.colors.Color;
import creation.abstractfactory.tutorialspoint.colors.Red;
import creation.abstractfactory.tutorialspoint.shapes.Circle;
import creation.abstractfactory.tutorialspoint.shapes.Shape;

public class ShapeFactory implements AbstractFactory {
    public Shape getShape(String shape) {
        return new Circle();
    }

    public Color getColor(String color) {
        return new Red();
    }
}

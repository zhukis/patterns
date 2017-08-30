package creation.abstractfactory.tutorialspoint.factories;

import creation.abstractfactory.tutorialspoint.colors.Color;
import creation.abstractfactory.tutorialspoint.shapes.Shape;

public interface AbstractFactory {
    Shape getShape(String shape);
    Color getColor(String color);
}

package structural.composite.journaldev;

import structural.composite.journaldev.component.Shape;
import structural.composite.journaldev.composite.Drawing;
import structural.composite.journaldev.leaf.Circle;
import structural.composite.journaldev.leaf.Triangle;

public class Demo {
    public static void main(String[] args) {
        Shape tri = new Triangle();
        Shape tri1 = new Triangle();
        Shape cir = new Circle();

        Drawing drawing = new Drawing();
        drawing.add(tri1);
        drawing.add(tri1);
        drawing.add(cir);

//        drawing.draw("Red");

        Drawing drawing1 = new Drawing();
        drawing1.add(tri);
        drawing1.add(drawing);

        drawing1.draw("Red");
    }
}

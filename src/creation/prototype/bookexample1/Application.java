package creation.prototype.bookexample1;

import java.util.ArrayList;
import java.util.List;

public class Application {
    private static List<Shape> shapes = new ArrayList<>();

    public static void construct() {
        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        shapes.add(circle);

        Circle anotherCircle = (Circle) circle.clone();
        shapes.add(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 20;
        shapes.add(rectangle);
    }

    public static void main(String[] args) {
        construct();
        ArrayList<Shape> arrayList = new ArrayList<>();

        for (Shape sh : shapes)
            arrayList.add(sh.clone());
    }
}

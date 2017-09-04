package structural.flyweight.wikiexample;

import java.awt.*;

public class Main {
    public static void main(String[] args) {

        Primitive[] primitives = {
                PrimitiveFactory.createPoint(),
                PrimitiveFactory.createCircle(10),
                PrimitiveFactory.createSquare(20, 30),
                PrimitiveFactory.createCircle(20),
                PrimitiveFactory.createCircle(20),
                PrimitiveFactory.createPoint(),
                PrimitiveFactory.createSquare(20, 40),
        };

        Picture picture = PrimitiveFactory.createPicture(primitives);
        Context context = new Context(10, 20, Color.BLUE);
        picture.draw(context);
    }
}

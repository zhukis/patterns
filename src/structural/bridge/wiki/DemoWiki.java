package structural.bridge.wiki;

import structural.bridge.wiki.abstraction.Circle;
import structural.bridge.wiki.abstraction.Shape;
import structural.bridge.wiki.impl.LargeCircleDrawer;
import structural.bridge.wiki.impl.SmallCircleDrawer;

public class DemoWiki {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(5, 10, 10, new LargeCircleDrawer()),
                new Circle(20, 30, 100, new SmallCircleDrawer())};

        for (Shape next : shapes) {
            next.draw();
        }
    }
}

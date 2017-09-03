package structural.composite.journaldev.leaf;

import structural.composite.journaldev.component.Shape;

public class Circle implements Shape {
    @Override
    public void draw(String fillColor) {
        System.out.println("Drawing Circle");
    }
}

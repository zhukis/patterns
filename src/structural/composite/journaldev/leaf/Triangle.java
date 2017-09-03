package structural.composite.journaldev.leaf;

import structural.composite.journaldev.component.Shape;

public class Triangle implements Shape {
    public void draw(String fillColor) {
        System.out.println("Drawing Triangle with color " + fillColor);
    }
}

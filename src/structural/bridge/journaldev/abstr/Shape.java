package structural.bridge.journaldev.abstr;

import structural.bridge.journaldev.impls.Color;

public abstract class Shape {
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    abstract public void applyColor();
}

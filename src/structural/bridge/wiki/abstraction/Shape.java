package structural.bridge.wiki.abstraction;

import structural.bridge.wiki.impl.Drawer;

public abstract class Shape {
    protected Drawer drawer;

    protected Shape(Drawer drawer) {
        this.drawer = drawer;
    }

    public abstract void draw();

    public abstract void enlargeRadius(int multiplier);
}

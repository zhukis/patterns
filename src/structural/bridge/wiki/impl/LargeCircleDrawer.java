package structural.bridge.wiki.impl;

public class LargeCircleDrawer implements Drawer {
    public static final int radiusMaultiplier = 10;

    public void drawCircle(int x, int y, int radius) {
        System.out.println("Large circle center = " + x + ", " + y + " radius = " + radius * radiusMaultiplier);
    }
}

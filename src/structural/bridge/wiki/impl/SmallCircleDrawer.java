package structural.bridge.wiki.impl;

public class SmallCircleDrawer implements Drawer {
    public static final double radiusMultiplier = 0.25;

    public void drawCircle(int x, int y, int radius) {
        System.out.println("Small circle center = " + x + ", " + y + " radius = " + radius*radiusMultiplier);
    }
}

package behavioral.visitor.wikiexample.shape;

import behavioral.visitor.wikiexample.visitor.Visitor;

public class Point3d extends Point {
    private double x;
    private double y;
    private double z;

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }
}

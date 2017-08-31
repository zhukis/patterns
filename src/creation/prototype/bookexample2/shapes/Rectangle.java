package creation.prototype.bookexample2.shapes;

public class Rectangle extends Shape {
    public int width;
    public int height;

    public Rectangle() {}

    public Rectangle(Rectangle target) {
        super(target);

        if (target != null) {
            this.width = target.width;
            this.height = target.height;
        }
    }

    public Shape clone() {
        return new Rectangle(this);
    }

    public boolean equals(Object object2) {
        if (!(object2 instanceof Rectangle) || !super.equals(object2)) return false;
        Rectangle shape2 = (Rectangle) object2;
        return shape2.width == width && shape2.height == height;
    }
}

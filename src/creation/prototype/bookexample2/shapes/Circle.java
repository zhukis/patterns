package creation.prototype.bookexample2.shapes;

public class Circle extends Shape {
    public int radius;

    public Circle() {}

    public Circle(Circle target) {
        super(target);

        if (target != null) {
            this.radius = target.radius;
        }
    }

    public Shape clone() {
        return new Circle(this);
    }

    public boolean equals(Object object2) {
        if (!(object2 instanceof Circle) || !super.equals(object2)) return false;
        Circle shape2 = (Circle) object2;
        return shape2.radius == radius;
    }
}

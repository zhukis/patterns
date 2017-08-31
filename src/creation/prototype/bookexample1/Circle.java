package creation.prototype.bookexample1;

public class Circle extends Shape {
    int radius;

    public Circle() {
        radius = 0;
    }

    public Circle(Circle target) {
        super(target);

        if (target != null) {
            this.radius = target.radius;
        }
    }

    public Shape clone() {
        return new Circle(this);
    }
}

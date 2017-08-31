package creation.prototype.bookexample1;

public abstract class Shape {
    int x;
    int y;
    String color;

    public Shape() {
        x = 0;
        y = 0;
        color = "RGB";
    }

    public Shape(Shape target) {
        if (target != null) {
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }
    }

    public abstract Shape clone();
}

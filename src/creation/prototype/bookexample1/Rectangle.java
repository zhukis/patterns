package creation.prototype.bookexample1;

public class Rectangle extends Shape {
    int width;
    int height;

    public Rectangle() {
        width = 0;
        height = 0;
    }

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
}

package structural.composite.bookexample1.shapes;

import java.awt.*;

public abstract class BaseShape implements Shape {
    public int x;
    public int y;
    public Color color;
    private Boolean selected = false;

    BaseShape(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return 0;
    }

    public int getHeight() {
        return 0;
    }

    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }

    public Boolean isInsideBounds(int x, int y) {
        return x > getX() && x < (getX() + getWidth()) &&
                y > getY() && y < (getY() + getHeight());
    }

    public void select() {
        selected = true;
    }

    public void unSelect() {
        selected = false;
    }

    public Boolean isSelected() {
        return selected;
    }

    void enableSelectionStyle(Graphics graphics) {
        graphics.setColor(Color.LIGHT_GRAY);

        Graphics2D g2 = (Graphics2D) graphics;
        Stroke backup = g2.getStroke();
        float dash1[] = {2.0f};
        g2.setStroke(new BasicStroke(1.0f,
                BasicStroke.CAP_BUTT,
                BasicStroke.JOIN_MITER,
                2.0f, dash1, 0.0f));
    }

    void disableSelectionStyle(Graphics graphics) {
        graphics.setColor(color);
        Graphics2D g2 = (Graphics2D) graphics;
        g2.setStroke(new BasicStroke());
    }

    public void paint(Graphics graphics) {
        if (isSelected()) {
            enableSelectionStyle(graphics);
        } else {
            disableSelectionStyle(graphics);
        }
    }
}

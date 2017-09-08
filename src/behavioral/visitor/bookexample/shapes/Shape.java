package behavioral.visitor.bookexample.shapes;

import behavioral.visitor.bookexample.visitor.Visitor;

public interface Shape {
    void move(int x, int y);
    void draw();
    String accept(Visitor visitor);
}

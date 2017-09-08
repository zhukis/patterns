package behavioral.visitor.bookexample.visitor;

import behavioral.visitor.bookexample.shapes.Circle;
import behavioral.visitor.bookexample.shapes.CompoundShape;
import behavioral.visitor.bookexample.shapes.Dot;
import behavioral.visitor.bookexample.shapes.Rectangle;

public interface Visitor {
    String visitDot(Dot dot);
    String visitCircle(Circle circle);
    String visitRectangle(Rectangle rectangle);
    String visitCompoundGraphic(CompoundShape cg);
}

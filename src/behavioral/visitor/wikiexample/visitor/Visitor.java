package behavioral.visitor.wikiexample.visitor;

import behavioral.visitor.wikiexample.shape.Point2d;
import behavioral.visitor.wikiexample.shape.Point3d;

public interface Visitor {
    void visit(Point2d point);
    void visit(Point3d point);
}

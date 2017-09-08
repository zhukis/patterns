package behavioral.visitor.wikiexample;

import behavioral.visitor.wikiexample.shape.Point;
import behavioral.visitor.wikiexample.shape.Point2d;
import behavioral.visitor.wikiexample.visitor.Chebyshev;
import behavioral.visitor.wikiexample.visitor.Visitor;

public class Demo {
    public static void main(String[] args) {
        Point point = new Point2d(1, 2);
        Visitor visitor = new Chebyshev();
        point.accept(visitor);
        System.out.println(point.getMetric());
    }
}

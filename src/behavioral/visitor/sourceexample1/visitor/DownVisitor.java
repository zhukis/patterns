package behavioral.visitor.sourceexample1.visitor;

import behavioral.visitor.sourceexample1.element.BAR;
import behavioral.visitor.sourceexample1.element.BAZ;
import behavioral.visitor.sourceexample1.element.FOO;

public class DownVisitor implements Visitor {
    public void visit(FOO foo) {
        System.out.println("do Down on " + foo.getFOO());
    }

    public void visit(BAR bar) {
        System.out.println("do Down on " + bar.getBAR());
    }

    public void visit(BAZ baz ) {
        System.out.println("do Down on " + baz.getBAZ());
    }
}

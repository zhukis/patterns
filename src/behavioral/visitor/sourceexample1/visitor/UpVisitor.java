package behavioral.visitor.sourceexample1.visitor;

import behavioral.visitor.sourceexample1.element.BAR;
import behavioral.visitor.sourceexample1.element.BAZ;
import behavioral.visitor.sourceexample1.element.FOO;

public class UpVisitor implements Visitor {
    @Override
    public void visit(FOO foo) {
        System.out.println("do Up on " + foo.getFOO());
    }

    @Override
    public void visit(BAR bar) {
        System.out.println("do Up on " + bar.getBAR());
    }

    @Override
    public void visit(BAZ baz) {
        System.out.println("do Up on " + baz.getBAZ());
    }
}

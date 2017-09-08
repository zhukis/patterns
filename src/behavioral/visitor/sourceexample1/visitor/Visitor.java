package behavioral.visitor.sourceexample1.visitor;

import behavioral.visitor.sourceexample1.element.BAR;
import behavioral.visitor.sourceexample1.element.BAZ;
import behavioral.visitor.sourceexample1.element.FOO;

public interface Visitor {
    void visit(FOO foo);
    void visit(BAR bar);
    void visit(BAZ baz);
}

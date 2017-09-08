package behavioral.visitor.sourceexample1.element;

import behavioral.visitor.sourceexample1.visitor.Visitor;

public interface Element {
    void accept(Visitor visitor);
}

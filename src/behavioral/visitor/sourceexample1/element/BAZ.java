package behavioral.visitor.sourceexample1.element;

import behavioral.visitor.sourceexample1.visitor.Visitor;

public class BAZ implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getBAZ() {
        return "BAZ";
    }
}

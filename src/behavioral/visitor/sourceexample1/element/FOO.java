package behavioral.visitor.sourceexample1.element;

import behavioral.visitor.sourceexample1.visitor.Visitor;

public class FOO implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getFOO() {
        return "FOO";
    }
}

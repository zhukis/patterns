package behavioral.visitor.journalexample.element;

import behavioral.visitor.journalexample.visitor.ShoppingCartVisitor;

public interface ItemElement {
    int accept(ShoppingCartVisitor visitor);
}

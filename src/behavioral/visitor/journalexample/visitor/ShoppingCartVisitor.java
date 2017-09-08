package behavioral.visitor.journalexample.visitor;

import behavioral.visitor.journalexample.element.Book;
import behavioral.visitor.journalexample.element.Fruit;

public interface ShoppingCartVisitor {
    int visit(Book book);
    int visit(Fruit fruit);
}

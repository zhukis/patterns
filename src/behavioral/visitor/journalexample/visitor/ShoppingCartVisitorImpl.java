package behavioral.visitor.journalexample.visitor;

import behavioral.visitor.journalexample.element.Book;
import behavioral.visitor.journalexample.element.Fruit;

public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {
    @Override
    public int visit(Book book) {
        int cost = 0;
        if (book.getPrice() > 50) {
            cost = book.getPrice() - 5;
        } else {
            cost = book.getPrice();
        }
        System.out.println("Book ISBN::"
                + book.getIsbnNumber() + " cost = " + cost);

        return cost;
    }

    @Override
    public int visit(Fruit fruit) {
        int cost = fruit.getProcePerKg() * fruit.getWeight();
        System.out.println(fruit.getName() + " cost = " + cost);
        return cost;
    }
}

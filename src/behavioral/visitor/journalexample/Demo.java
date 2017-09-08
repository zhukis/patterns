package behavioral.visitor.journalexample;

import behavioral.visitor.journalexample.element.Book;
import behavioral.visitor.journalexample.element.Fruit;
import behavioral.visitor.journalexample.element.ItemElement;
import behavioral.visitor.journalexample.visitor.ShoppingCartVisitor;
import behavioral.visitor.journalexample.visitor.ShoppingCartVisitorImpl;

public class Demo {
    public static void main(String[] args) {
        ItemElement[] items = new ItemElement[] {
                new Book(20, "1234"),
                new Book(100, "5678"),
                new Fruit(10, 2, "Banana"),
                new Fruit(5, 5, "Apple")};
        int total = calculatePrice(items);;
        System.out.println("Total Cost = " + total);
    }

    private static int calculatePrice(ItemElement[] items) {
        ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
        int sum = 0;

        for (ItemElement item : items) {
            sum += item.accept(visitor);
        }

        return sum;
    }
}

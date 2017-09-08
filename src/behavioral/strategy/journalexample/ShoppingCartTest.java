package behavioral.strategy.journalexample;

import behavioral.strategy.journalexample.strategy.CreditCardStrategy;
import behavioral.strategy.journalexample.strategy.PaypalStrategy;

public class ShoppingCartTest {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("1234", 10);
        Item item2 = new Item("5678", 40);

        cart.addItem(item1);
        cart.addItem(item2);

        cart.pay(new PaypalStrategy("myemail@example.com", "1234"));
        cart.pay(new CreditCardStrategy("Ihar Zhuk", "123", "123", "12/12"));
    }
}

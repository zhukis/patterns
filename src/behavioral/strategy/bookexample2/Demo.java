package behavioral.strategy.bookexample2;

import behavioral.strategy.bookexample2.order.Order;
import behavioral.strategy.bookexample2.strategies.PayByCreaditCard;
import behavioral.strategy.bookexample2.strategies.PayByPayPal;
import behavioral.strategy.bookexample2.strategies.PayStrategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Demo {
    public static Map<Integer, Integer> priceOnProducts = new HashMap<>();
    public static BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
    private static Order order = new Order();
    private static PayStrategy strategy;

    static {
        priceOnProducts.put(1, 2200);
        priceOnProducts.put(2, 1850);
        priceOnProducts.put(3, 1100);
        priceOnProducts.put(4, 890);
    }

    public static void main(String[] args) throws IOException {
        while (!order.isClosed()) {
            int cost;

            String continueChoice;
            do {
                System.out.print("Select a product:" + "\n" +
                        "1 - Mother board" + "\n" +
                        "2 - CPU" + "\n" +
                        "3 - HDD" + "\n" +
                        "4 - Memory" + "\n");
                int choice = Integer.parseInt(reader.readLine());
                cost = priceOnProducts.get(choice);
                System.out.print("Count: ");
                int count = Integer.parseInt(reader.readLine());
                order.setTotalCost(cost * count);
                System.out.print("You wish to continue selection? Y/N: ");
                continueChoice = reader.readLine();
            } while (continueChoice.equalsIgnoreCase("Y"));

            if (strategy == null) {
                System.out.println("Select a Payment Method" + "\n" +
                        "1 - PalPay" + "\n" +
                        "2 - Credit Card");
                String paymentMethod = reader.readLine();

                // Клиент создаёт различные стратегии на основании
                // пользовательских данных, конфигурации и прочих параметров.
                if (paymentMethod.equals("1")) {
                    strategy = new PayByPayPal();
                } else if (paymentMethod.equals("2")) {
                    strategy = new PayByCreaditCard();
                }

                // Объект заказа делегирует сбор платёжных данны стратегии, т.к.
                // только стратегии знают какие данные им нужны для
                // приёма оплаты.
                order.processOrder(strategy);
            }

            System.out.print("Pay " + Order.getTotalCost() + " units or Continue shopping?  P/C: ");
            String proceed = reader.readLine();
            if (proceed.equalsIgnoreCase("P")) {
                // И наконец, стратегия запускает приём платежа.
                if (strategy.pay(Order.getTotalCost())) {
                    System.out.println("Payment has succeeded");
                } else {
                    System.out.println("FAIL! Check your data");
                }
                order.setClosed(true);
            }
        }
    }
}

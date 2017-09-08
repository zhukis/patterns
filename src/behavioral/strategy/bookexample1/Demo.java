package behavioral.strategy.bookexample1;

public class Demo {
    public static void main(String[] args) {
        Context context = new Context();
        context.setStrategy(new StrategyAdd());

        System.out.println(context.calculate(1, 5));

        context.setStrategy(new StrategyMul());
        System.out.println(context.calculate(2, 4));
    }
}

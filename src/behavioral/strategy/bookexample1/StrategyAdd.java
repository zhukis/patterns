package behavioral.strategy.bookexample1;

public class StrategyAdd implements Strategy {
    @Override
    public double algorithm(double a, double b) {
        return a + b;
    }
}

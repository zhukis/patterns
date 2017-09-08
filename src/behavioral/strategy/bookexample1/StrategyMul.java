package behavioral.strategy.bookexample1;

public class StrategyMul implements Strategy {
    @Override
    public double algorithm(double a, double b) {
        return a * b;
    }
}

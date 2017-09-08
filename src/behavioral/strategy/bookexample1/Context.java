package behavioral.strategy.bookexample1;

public class Context {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    double calculate(double a, double b) {
        return strategy.algorithm(a, b);
    }
}

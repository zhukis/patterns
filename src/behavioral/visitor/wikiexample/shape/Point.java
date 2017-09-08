package behavioral.visitor.wikiexample.shape;

import behavioral.visitor.wikiexample.visitor.Visitor;

public abstract class Point {
    public abstract void accept(Visitor visitor);

    private double metric = -1;

    public double getMetric() {
        return metric;
    }

    public void setMetric(double metric) {
        this.metric = metric;
    }
}

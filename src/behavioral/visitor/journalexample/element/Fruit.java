package behavioral.visitor.journalexample.element;

import behavioral.visitor.journalexample.visitor.ShoppingCartVisitor;

public class Fruit implements ItemElement {
    private int procePerKg;
    private int weight;
    private String name;

    public Fruit(int procePerKg, int weight, String name) {
        this.procePerKg = procePerKg;
        this.weight = weight;
        this.name = name;
    }

    public int getProcePerKg() {
        return procePerKg;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    @Override
    public int accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}

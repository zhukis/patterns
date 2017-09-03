package structural.decorator.wikiexample;

public class DecoratorComma extends Decorator {
    public DecoratorComma(InterfaceComponent component) {
        super(component);
    }

    @Override
    public void doOperation() {
        System.out.print(",");
        super.doOperation();
    }

    @Override
    public void newOperation() {
        System.out.println("New comma operation");
    }
}

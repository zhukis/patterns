package structural.decorator.wikiexample;

public class DecoratorSpace extends Decorator {
    public DecoratorSpace(InterfaceComponent component) {
        super(component);
    }

    @Override
    public void doOperation() {
        System.out.print(" ");
        super.doOperation();
    }

    @Override
    public void newOperation() {
        System.out.println("New space operation");
    }
}

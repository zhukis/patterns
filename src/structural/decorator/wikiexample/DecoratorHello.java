package structural.decorator.wikiexample;

public class DecoratorHello extends Decorator {
    public DecoratorHello(InterfaceComponent component) {
        super(component);
    }

    @Override
    public void doOperation() {
        System.out.print("Hello");
        super.doOperation();
    }

    @Override
    public void newOperation() {
        System.out.println("New hello operation");
    }
}

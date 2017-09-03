package structural.decorator.wikiexample;

public abstract class Decorator implements InterfaceComponent {
    protected InterfaceComponent component;

    public Decorator(InterfaceComponent component) {
        this.component = component;
    }

    @Override
    public void doOperation() {
        component.doOperation();
    }

    public void newOperation() {
        System.out.println("Do nothing");
    }
}

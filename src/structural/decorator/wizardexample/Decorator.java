package structural.decorator.wizardexample;

public abstract class Decorator implements InterfaceComponent {
    protected InterfaceComponent component;

    public Decorator(InterfaceComponent component) {
        this.component = component;
    }

    @Override
    public int getPrice() {
        return component.getPrice();
    }
}

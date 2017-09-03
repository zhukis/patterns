package structural.decorator.wizardexample;

public class DecoratorClimatControl extends Decorator {
    public DecoratorClimatControl(InterfaceComponent component) {
        super(component);
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 1500;
    }

    public void getNameParameter() {
        System.out.println("#ClimatControl");
    }
}

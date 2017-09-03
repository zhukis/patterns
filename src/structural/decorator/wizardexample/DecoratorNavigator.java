package structural.decorator.wizardexample;

public class DecoratorNavigator extends Decorator {
    public DecoratorNavigator(InterfaceComponent component) {
        super(component);
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 300;
    }

    public void getNameParameter() {
        System.out.println("#Navigator");
    }
}

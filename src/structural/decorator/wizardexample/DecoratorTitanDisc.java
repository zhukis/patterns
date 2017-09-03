package structural.decorator.wizardexample;

public class DecoratorTitanDisc extends Decorator {
    public DecoratorTitanDisc(InterfaceComponent component) {
        super(component);
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 2000;
    }

    public void getNameParameter() {
        System.out.println("#TitanDisc");
    }
}

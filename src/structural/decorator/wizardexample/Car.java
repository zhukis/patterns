package structural.decorator.wizardexample;

public class Car implements InterfaceComponent {
    @Override
    public int getPrice() {
        return 6000;
    }

    public void move() {
        System.out.println("I am car");
    }
}

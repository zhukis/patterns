package structural.decorator.wizardexample;

public class Demo {
    public static void main(String[] args) {
        Decorator commonprice = new DecoratorNavigator(
                new DecoratorTitanDisc(
                        new Car()));
        System.out.println(commonprice.getPrice());
    }
}

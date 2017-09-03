package structural.decorator.wikiexample;

public class Demo {
    public static void main(String[] args) {
        Decorator c = new DecoratorHello(
                new DecoratorComma(
                        new DecoratorSpace(
                                new MainComponent())));
        c.doOperation();
        c.newOperation();
    }
}

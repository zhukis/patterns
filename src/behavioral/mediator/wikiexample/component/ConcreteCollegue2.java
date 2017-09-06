package behavioral.mediator.wikiexample.component;

import behavioral.mediator.wikiexample.mediator.Mediator;

public class ConcreteCollegue2 extends Colleague {
    public ConcreteCollegue2(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void notify(String message) {
        System.out.println("Colleague2 gets message: " + message);
    }
}

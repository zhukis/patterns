package behavioral.mediator.wikiexample.component;

import behavioral.mediator.wikiexample.mediator.Mediator;

public class ConcreteCollegue1 extends Colleague {
    public ConcreteCollegue1(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void notify(String message) {
        System.out.println("Colleague1 gets message: " + message);
    }
}

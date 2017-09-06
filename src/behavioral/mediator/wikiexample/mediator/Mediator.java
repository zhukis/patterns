package behavioral.mediator.wikiexample.mediator;

import behavioral.mediator.wikiexample.component.Colleague;

public abstract class Mediator {
    public abstract void send(String message, Colleague colleague);
}

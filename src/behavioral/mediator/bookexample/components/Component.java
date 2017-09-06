package behavioral.mediator.bookexample.components;

import behavioral.mediator.bookexample.mediator.Mediator;

public interface Component {
    void setMediator(Mediator mediator);
    String getName();
}

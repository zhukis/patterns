package behavioral.mediator.wikiexample.mediator;

import behavioral.mediator.wikiexample.component.Colleague;
import behavioral.mediator.wikiexample.component.ConcreteCollegue1;
import behavioral.mediator.wikiexample.component.ConcreteCollegue2;

public class ConcreteMediator extends Mediator {
    ConcreteCollegue1 collegue1;
    ConcreteCollegue2 collegue2;

    public void setCollegue1(ConcreteCollegue1 collegue1) {
        this.collegue1 = collegue1;
    }

    public void setCollegue2(ConcreteCollegue2 collegue2) {
        this.collegue2 = collegue2;
    }

    @Override
    public void send(String message, Colleague colleague) {
        if (colleague.equals(collegue2)) {
            collegue1.notify(message);
        } else {
            collegue2.notify(message);
        }
    }
}

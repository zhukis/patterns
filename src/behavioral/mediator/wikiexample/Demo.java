package behavioral.mediator.wikiexample;

import behavioral.mediator.wikiexample.component.ConcreteCollegue1;
import behavioral.mediator.wikiexample.component.ConcreteCollegue2;
import behavioral.mediator.wikiexample.mediator.ConcreteMediator;

public class Demo {
    public static void main(String[] args) {
        ConcreteMediator m = new ConcreteMediator();

        ConcreteCollegue1 c1 = new ConcreteCollegue1(m);
        ConcreteCollegue2 c2 = new ConcreteCollegue2(m);

        m.setCollegue1(c1);
        m.setCollegue2(c2);

        c1.send("How are you?");
        c2.send("Fine, thanks");
    }
}

package behavioral.mediator.journalexample.colleague;

import behavioral.mediator.journalexample.mediator.ChatMediator;

public class UserImpl extends User {
    public UserImpl(ChatMediator med, String name) {
        super(med, name);
    }

    @Override
    public void send(String msg) {
        System.out.println(name + ": Received Message = " + msg);
        mediator.sendMessage(msg, this);
    }

    @Override
    public void receive(String msg) {
        System.out.println(name + ": Received Message: " + msg);
    }
}

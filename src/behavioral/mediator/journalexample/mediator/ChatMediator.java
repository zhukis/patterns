package behavioral.mediator.journalexample.mediator;

import behavioral.mediator.journalexample.colleague.User;

public interface ChatMediator {
    void sendMessage(String msg, User user);
    void addUser(User user);
}

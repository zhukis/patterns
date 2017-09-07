package behavioral.observer.wikiexample.observable;

import behavioral.observer.wikiexample.observer.Observer;

public interface Observable {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}

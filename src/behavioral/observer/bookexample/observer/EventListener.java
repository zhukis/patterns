package behavioral.observer.bookexample.observer;

import java.io.File;

public interface EventListener {
    void update(String eventType, File file);
}

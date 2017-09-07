package behavioral.observer.bookexample;

import behavioral.observer.bookexample.editor.Editor;
import behavioral.observer.bookexample.observer.EmailNotificationListener;
import behavioral.observer.bookexample.observer.LogOpenListener;

public class Demo {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("D:\\1.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

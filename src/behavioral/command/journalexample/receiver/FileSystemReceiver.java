package behavioral.command.journalexample.receiver;

public interface FileSystemReceiver {
    void openFile();
    void writeFile();
    void closeFile();
}

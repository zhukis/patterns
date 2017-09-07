package behavioral.memento.journalexample;

public class Demo {
    public static void main(String[] args) {
        FileWriterCaretaker caretaker = new FileWriterCaretaker();
        FileWriterUtil fileWriter = new FileWriterUtil("data.txt");
        fileWriter.write("GoogleChrome");
        caretaker.save(fileWriter);

        fileWriter.write("Yandex");
        System.out.println(fileWriter.toString());
        caretaker.undo(fileWriter);
        System.out.println(fileWriter.toString());
    }
}

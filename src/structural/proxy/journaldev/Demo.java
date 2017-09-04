package structural.proxy.journaldev;

public class Demo {
    public static void main(String[] args) {
        CommandExecutor executor = new CommandExecutorProxy("Ihar", "123");
        try {
            executor.runCommand("ls -ltf");
            executor.runCommand(" rm -rf abc.pdf");
        } catch (Exception e) {
            System.out.println("Exception Message::" + e.getMessage());
        }
    }
}

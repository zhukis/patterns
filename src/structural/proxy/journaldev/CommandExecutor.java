package structural.proxy.journaldev;

public interface CommandExecutor {
    void runCommand(String cmd) throws Exception;
}

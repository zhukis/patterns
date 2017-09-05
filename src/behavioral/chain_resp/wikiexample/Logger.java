package behavioral.chain_resp.wikiexample;

public abstract class Logger {
    protected Logger next;

    public static int ERR = 3;
    public static int NOTICE = 5;
    public static int DEBUG = 7;
    protected int mask;

    public Logger setNext(Logger next) {
        this.next = next;
        return next;
    }

    public void message(String msg, int priority) {
        if (priority <= mask) {
            writeMessage(msg);
        }

        checkNext(msg, priority);
    }

    protected void checkNext(String msg, int priority) {
        if (next != null) {
            next.message(msg, priority);
        }
    }

    abstract protected void writeMessage(String msg);
}

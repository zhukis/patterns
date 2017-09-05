package behavioral.chain_resp.wikiexample;

public class Demo {
    public static void main(String[] args) {
        Logger logger = new EmailLogger(12);
        logger.setNext(new StderrLogger(12));
        logger.setNext(new StderrLogger(12));

        logger.message("Google", 12);
    }
}

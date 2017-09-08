package behavioral.template_method.tutorialsexample.concr;

import behavioral.template_method.tutorialsexample.interf.Game;

public class Cricket extends Game {
    @Override
    protected void initialize() {
        System.out.println("Cricket inited.");
    }

    @Override
    protected void startPlay() {
        System.out.println("Cricket started.");
    }

    @Override
    protected void endPlay() {
        System.out.println("Cricket finished");
    }
}

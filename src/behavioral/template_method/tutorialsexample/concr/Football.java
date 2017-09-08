package behavioral.template_method.tutorialsexample.concr;

import behavioral.template_method.tutorialsexample.interf.Game;

public class Football extends Game {
    @Override
    protected void initialize() {
        System.out.println("Football inited.");
    }

    @Override
    protected void startPlay() {
        System.out.println("Football started");
    }

    @Override
    protected void endPlay() {
        System.out.println("Football finished");
    }
}

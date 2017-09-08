package behavioral.template_method.tutorialsexample;

import behavioral.template_method.tutorialsexample.concr.Cricket;
import behavioral.template_method.tutorialsexample.concr.Football;
import behavioral.template_method.tutorialsexample.interf.Game;

public class Demo {
    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println();

        game = new Football();
        game.play();
    }
}

package behavioral.state.bookexample;

import behavioral.state.bookexample.ui.Player;
import behavioral.state.bookexample.ui.UI;

public class Demo {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}

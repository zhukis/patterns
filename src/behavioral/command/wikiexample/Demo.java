package behavioral.command.wikiexample;

import behavioral.command.wikiexample.commands.Command;
import behavioral.command.wikiexample.commands.TurnOffLightCommand;
import behavioral.command.wikiexample.commands.TurnOnLightCommand;
import behavioral.command.wikiexample.invoker.Switch;
import behavioral.command.wikiexample.receiver.Light;

public class Demo {
    public static void main(String[] args) {
        Light light = new Light();
        Command switchUp = new TurnOnLightCommand(light);
        Command switchDown = new TurnOffLightCommand(light);

        Switch s = new Switch(switchUp, switchDown);

        s.flipUp();
        s.flipDown();
    }
}

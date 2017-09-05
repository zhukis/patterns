package behavioral.command.wikiexample.commands;

import behavioral.command.wikiexample.receiver.Light;

public class TurnOnLightCommand implements Command {
    private Light theLight;

    public TurnOnLightCommand(Light theLight) {
        this.theLight = theLight;
    }

    @Override
    public void execute() {
        theLight.turnOn();
    }
}

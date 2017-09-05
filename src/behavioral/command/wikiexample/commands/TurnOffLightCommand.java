package behavioral.command.wikiexample.commands;

import behavioral.command.wikiexample.receiver.Light;

public class TurnOffLightCommand implements Command {
    private Light theLight;

    public TurnOffLightCommand(Light theLight) {
        this.theLight = theLight;
    }

    @Override
    public void execute() {
        theLight.turnOff();
    }
}

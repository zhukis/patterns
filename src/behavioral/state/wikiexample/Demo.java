package behavioral.state.wikiexample;

import behavioral.state.wikiexample.context.Context;
import behavioral.state.wikiexample.state.StartState;
import behavioral.state.wikiexample.state.StopState;

public class Demo {
    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }
}

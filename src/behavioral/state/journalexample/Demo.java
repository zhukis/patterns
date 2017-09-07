package behavioral.state.journalexample;

import behavioral.state.journalexample.context.TVContext;
import behavioral.state.journalexample.state.State;
import behavioral.state.journalexample.state.TVStartState;
import behavioral.state.journalexample.state.TVStopState;

public class Demo {
    public static void main(String[] args) {
        TVContext context = new TVContext();
        State tvStartState = new TVStartState();
        State tvStopState = new TVStopState();

        context.setState(tvStartState);
        context.doAction();

        context.setState(tvStopState);
        context.doAction();
    }
}

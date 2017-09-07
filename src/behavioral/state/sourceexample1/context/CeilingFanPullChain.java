package behavioral.state.sourceexample1.context;

import behavioral.state.sourceexample1.state.Off;
import behavioral.state.sourceexample1.state.State;

public class CeilingFanPullChain {
    private State currentState;

    public CeilingFanPullChain() {
        currentState = new Off();
    }

    public void setState(State state) {
        currentState = state;
    }

    public void pull() {
        currentState.pull(this);
    }
}

package behavioral.state.wikiexample.state;

import behavioral.state.wikiexample.context.Context;

public interface State {
    void doAction(Context context);
}

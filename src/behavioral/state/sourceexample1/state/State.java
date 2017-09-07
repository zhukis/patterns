package behavioral.state.sourceexample1.state;

import behavioral.state.sourceexample1.context.CeilingFanPullChain;

public interface State {
    void pull(CeilingFanPullChain wrapper);
}

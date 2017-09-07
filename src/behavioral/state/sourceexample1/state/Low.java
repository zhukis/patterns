package behavioral.state.sourceexample1.state;

import behavioral.state.sourceexample1.context.CeilingFanPullChain;

public class Low implements State {
    @Override
    public void pull(CeilingFanPullChain wrapper) {
        wrapper.setState(new Medium());
        System.out.println("medium speed");
    }
}

package behavioral.state.sourceexample1.state;

import behavioral.state.sourceexample1.context.CeilingFanPullChain;

public class Off implements State {
    @Override
    public void pull(CeilingFanPullChain wrapper) {
        wrapper.setState(new Low());
        System.out.println("low speed");
    }
}

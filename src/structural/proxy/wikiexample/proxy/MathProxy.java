package structural.proxy.wikiexample.proxy;

import structural.proxy.wikiexample.interf.IMath;
import structural.proxy.wikiexample.real.Math;

public class MathProxy implements IMath {
    private Math math;

    @Override
    public double add(double x, double y) {
        if (math == null) {
            math = new Math();
        }
        return math.add(x, y);
    }

    @Override
    public double sub(double x, double y) {
        if (math == null) {
            math = new Math();
        }
        return math.sub(x, y);
    }

    @Override
    public double mul(double x, double y) {
        if (math == null) {
            math = new Math();
        }
        return math.mul(x, y);
    }

    @Override
    public double div(double x, double y) {
        if (math == null) {
            math = new Math();
        }
        return math.div(x, y);
    }
}

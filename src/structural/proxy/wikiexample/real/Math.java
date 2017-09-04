package structural.proxy.wikiexample.real;

import structural.proxy.wikiexample.interf.IMath;

public class Math implements IMath {
    @Override
    public double add(double x, double y) {
        return x + y;
    }

    @Override
    public double sub(double x, double y) {
        return x - y;
    }

    @Override
    public double mul(double x, double y) {
        return x * y;
    }

    @Override
    public double div(double x, double y) {
        return x / y;
    }
}

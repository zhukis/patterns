package structural.proxy.habraexample.real;

import structural.proxy.habraexample.abstr.Cell;

public class Mine extends Cell {
    public Mine(int left, int top) {
        super(left, top);
    }

    @Override
    public int getPoints() {
        return 100;
    }
}

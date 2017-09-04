package structural.proxy.habraexample.real;

import structural.proxy.habraexample.abstr.Cell;

public class Empty extends Cell {
    public Empty(int left, int top) {
        super(left, top);
    }

    @Override
    public int getPoints() {
        return 10;
    }
}

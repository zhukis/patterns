package structural.proxy.habraexample;

import structural.proxy.habraexample.abstr.Cell;
import structural.proxy.habraexample.proxy.EmptyProxy;
import structural.proxy.habraexample.proxy.MineProxy;

public class Demo {
    public static void main(String[] args) {
        Cell cells[][] = new Cell[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i + j % 2 == 0) {
                    cells[i][j] = new MineProxy(i, j);
                } else {
                    cells[i][j] = new EmptyProxy(i, j);
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                cells[i][j].open();
            }
        }
    }
}

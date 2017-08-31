package structural.adapter.bookexample1;

import structural.adapter.bookexample1.adapters.SquarePegAdapter;
import structural.adapter.bookexample1.round.RoundHole;
import structural.adapter.bookexample1.round.RoundPeg;
import structural.adapter.bookexample1.square.SquarePeg;

public class Demo {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);

        if (hole.fits(rpeg)) {
            System.out.println("Round peg r5 fits round hole r5.");
        }

        SquarePeg smallPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(20);
//        hole.fits(largeSqPeg);

        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallPeg);
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);

        if (hole.fits(smallSqPegAdapter)) {
            System.out.println("Square peg w2 fits round hole r5.");
        }

        if (!hole.fits(largeSqPegAdapter)) {
            System.out.println("Square peg w20 does not fit into round hole r5.");
        }
    }
}

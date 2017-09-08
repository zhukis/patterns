package behavioral.strategy.sourceexample;

public class BAR extends StrategySearch {
    private int state = 1;

    @Override
    void preProcess() {
        System.out.print("PreProcess  ");
    }

    @Override
    boolean search() {
        System.out.print("Search-" + state++ + "    ");
        return state == 3;
    }

    @Override
    void postProcess() {
        System.out.print("Post");
    }
}

package structural.flyweight.wikiexample;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Picture implements Primitive {
    List<Primitive> children;

    public Picture(Primitive... primitives) {
        this.children = new LinkedList<>();
        this.children.addAll(Arrays.asList(primitives));
    }

    @Override
    public void draw(Context context) {
        for (Primitive p : children) {
            p.draw(context);
        }
    }
}

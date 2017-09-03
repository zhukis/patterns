package structural.composite.habraexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Container
public class Expression implements SubExpression {
    private List<SubExpression> exprs = new ArrayList<>();

    public Expression(SubExpression... exprs) {
        this.exprs.addAll(Arrays.asList(exprs));
    }

    public Number value() {
        Number result = 0f;

        for (SubExpression expr: exprs) {
            result = result.floatValue() + expr.value().floatValue();
        }

        return result;
    }

    public void add(SubExpression expr) {
        exprs.add(expr);
    }

    public void sub(SubExpression expr) {
        if (expr instanceof IntegerValue) {
            exprs.add(new IntegerValue(-1 * expr.value().intValue()));
        } else {
//            exprs.add(new FloatValue);
        }
    }

    @Override
    public SubExpression getSubExpression(int index) {
        return exprs.get(index);
    }
}

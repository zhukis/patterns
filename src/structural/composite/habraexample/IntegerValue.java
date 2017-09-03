package structural.composite.habraexample;

// Leaf
public class IntegerValue implements SubExpression {
    private Integer value;

    public IntegerValue(Integer value) {
        this.value = value;
    }

    public Number value() {
        return value;
    }

    public void add(SubExpression expr) {
        throw new UnsupportedOperationException();
    }

    public void sub(SubExpression expr) {
        throw new UnsupportedOperationException();
    }

    public SubExpression getSubExpression(int index) {
        throw new UnsupportedOperationException();
    }
}

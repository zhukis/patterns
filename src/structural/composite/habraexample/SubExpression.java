package structural.composite.habraexample;

public interface SubExpression {
    Number value();

    void add(SubExpression expr);
    void sub(SubExpression expr);
    SubExpression getSubExpression(int index);
}

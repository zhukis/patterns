package structural.composite.habraexample;

public class Demo {
    public static void main(String[] args) {
        SubExpression expr = new Expression();
        SubExpression a = new Expression(new IntegerValue(5),
                new IntegerValue(-2));
        SubExpression b = new Expression(new IntegerValue(11),
                new IntegerValue(6));

        expr.add(new IntegerValue(20));
        expr.add(a);
        expr.add(b);

        System.out.println(expr.value());
    }
}

package calculator;

public class Calculator {
    public static void main(String[] args) {
        // ((5 / 4) + 1)

        Expression exp = new AdditionExpression(new Number(1), new Number(3));

        System.out.println(exp.calculate());

        Expression exp2 = new AdditionExpression(new DivisionExpression(new Number(5), new Number(4)), new Number(1));

        System.out.println(exp2.calculate());
    }
}

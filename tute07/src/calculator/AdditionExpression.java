package calculator;

public class AdditionExpression implements Expression {
    private Expression left, right;

    public AdditionExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }


    public double calculate() {
        return left.calculate() + right.calculate();
    }

}

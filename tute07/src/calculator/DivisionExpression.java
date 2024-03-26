package calculator;

public class DivisionExpression implements Expression {
    private Expression left, right;


    public DivisionExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public double calculate() {
        double l = left.calculate();
        double r = right.calculate();

        return l / r;
    }
    
}

package week7.task1;

public class Substraction extends BinaryExpression {
    Expression left, right;
    public Substraction(Expression left, Expression right){
        this.left = left;
        this.right = right;
    }
    @Override
    public Expression left(){
        return left;
    }
    @Override
    public Expression right(){
        return right;
    }
    @Override
    public String toString(){
        return "Subtraction{ left: " + left + " ,right: " + right + "}";
    }
    @Override
    public int evaluate(){
        return left.evaluate() - right.evaluate();
    }
}

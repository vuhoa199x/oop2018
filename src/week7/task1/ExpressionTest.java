package week7.task1;



public class ExpressionTest {
    public static void main (String[] args){
        Expression e1 = new Numeral(10);
        Expression e2 = new Square(e1);
        Expression e3 = new Numeral(1);
        Expression e4 = new Substraction(e2,e3);
        Expression e5 = new Numeral(2);
        Expression e6 = new Numeral(3);
        Expression e7 = new Multiplication(e5,e6);
        Expression e8 = new Addition(e4, e7);
        Expression e9 = new Square(e8);

        System.out.println(e9.evaluate());

        Expression e10 = new Numeral(10);
        Expression e11 = new Numeral(0);
        try{
            Expression e12 = new Division(e10,e11);
            System.out.println(e12.evaluate());
        }catch(ArithmeticException e){
            System.out.println("loi chia cho 0");
        }
    }

}

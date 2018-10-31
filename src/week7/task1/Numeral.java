package week7.task1;

public class Numeral extends Expression{
    private int value;
    public Numeral(int value){
        this.value = value;
    }
    public Numeral(){
        this.value = 0;
    }
    @Override
    public String toString(){
        return "numeral{value = " + value +"}";
    }
    @Override
    public int evaluate(){
        return value;
    }
}

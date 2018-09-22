package week2.task2;

public class Fraction {
	private int numerator, denominator;
	
    // TODO: khai báo các thuộc tính

    public Fraction(int numerator, int denominator) {
       this.numerator = numerator;
       this.denominator = denominator;
    	// TODO: khởi tạo giá trị cho các thuộc tính numberator (tử số), denominator (mẫu số)
    }
    public void setNumerator(int numerator) {
    	this.numerator = numerator;
    }
    public void setDenominator(int denominator) {
    	this.denominator = denominator;
    }
    public int getNumerator() {
    	return this.numerator;
    }
    public int getDenominator() {
    	return this.denominator;
    }
    
    public void add(Fraction other) {
    	 int a=(this.getNumerator()*other.getDenominator()) + (other.getNumerator()*this.getDenominator());

    	  int b=other.getDenominator()*this.getDenominator();

    	  Fraction k=new Fraction(a,b);
    	  System.out.println("Ket qua Cong: " + k.numerator + "/" + k.denominator);
    	  
    	// TODO: Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới
        
    }

    public void subtract(Fraction other) {
        int a = (this.getNumerator() * other.getDenominator()) - (other.getNumerator() * this.getDenominator());
    	int b = other.getDenominator()*this.getDenominator();
    	
    	Fraction k = new Fraction(a,b);
    	System.out.println("ket qua tru: " + k.numerator + "/" + k.denominator);
    	// TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới
        
    }

    public void multiply(Fraction other) {
    	
    	int a = (this.getNumerator() * other.getNumerator());
    	int b = (this.getDenominator() * other.getDenominator());
    	
    	Fraction k = new Fraction(a,b);
    	System.out.println("ket qua nhan: " + k.numerator + "/" + k.denominator);
    	// TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới
        
    }

    public void divide(Fraction other) {
        int a = (this.getNumerator() * other.getDenominator());
        int b = (other.getDenominator() * this.getDenominator());
        
        Fraction k = new Fraction(a,b);
        System.out.println("ket qua chia: " + k.numerator + "/" + k.denominator);
    	// TODO: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới
        
    }
   
    public static void main (String[] args) {
    	Fraction ps1 = new Fraction(1, 2);
        Fraction ps2 = new Fraction(3, 4);
    	
    	ps1.add(ps2);
    	ps1.subtract(ps2);
    	ps1.multiply(ps2);
    	ps1.divide(ps2);
    }
}

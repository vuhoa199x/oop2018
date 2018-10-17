package week5_6.graphical;

public class Rectangle extends Shape{
    private double width ;
    private double height ;

    public Rectangle(){
        width = 1.0;
        height = 1.0;
    }

    public Rectangle(double width, double height){
        this.height = height;
        this.width = width;
    }


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        return getHeight()*getWidth();
    }
    public double getPerimeter(){
        return getHeight()+getWidth()+getWidth()+getHeight();
    }


}


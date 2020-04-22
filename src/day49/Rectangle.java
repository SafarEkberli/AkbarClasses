package day49;

public class Rectangle extends Shape {
    double length;
    double width;
public Rectangle(double length,double width){
    this.length = length;
    this.width = width;
}
    public void Area(){
        double Area = length*width;
        System.out.println("Area is "+Area);
    }

    @Override
    public void perimeter() {
        double perimeter = (length+width)*2;
        System.out.println("Perimeter of rectangle is "+perimeter);
    }
}

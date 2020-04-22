package day49;

public class Square  extends  Shape {

    double side;
    public Square(double side){
        this.side = side;
    }

    @Override
    public void Area() {
       double Area = side*side;
        System.out.println("Area of the square is "+Area);
    }

    @Override
    public void perimeter() {
       double perimeter = side *4;
        System.out.println("Perimeter of the square is "+perimeter);
    }
}

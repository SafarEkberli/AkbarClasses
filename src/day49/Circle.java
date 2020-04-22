package day49;

public class Circle extends Shape {
    double radius;
    double diameter ;
   final double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
        diameter = radius*2;

    }

    @Override
    public void Area() {
        double Area = radius *radius *PI;
        System.out.println("Area of the circle is "+Area);
    }

    @Override
    public void perimeter() {
        double perimeter = PI*diameter*2;
        System.out.println("Perimeter of the circle is "+perimeter);
    }
}


package day49;

public class Cylinder extends Shape{

    double radius;
    double height;
    final double PI = 3.14;
    double diameter;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
        diameter = radius*2;
    }

    @Override
    public void Area() {
        double Area = (PI*diameter*radius)+(height*2*PI*diameter);
        System.out.println("Area of the cylinder is "+Area);


    }

    @Override
    public void perimeter() {
        double perimeter = 2*(PI*diameter+height);
        System.out.println("Perimeter of cylinder is "+perimeter);

    }

    @Override
    public void capacity() {
        double capacity = (PI*radius*radius*height);
        System.out.println("Capacity of cylinder is  "+capacity);

    }
}

package day49;

public class Shape {
    public void Area() {
        System.out.println("Area is 0");
    }
    public void perimeter(){
        System.out.println("Perimeter is 0");
    }
    public void capacity(){
        System.out.println("Volume is 0");
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10,20);

        rectangle.Area();
        rectangle.perimeter();

        Square square1  = new Square(10);
        square1.Area();

        Circle circle1 = new Circle(5);
        circle1.Area();
        circle1.perimeter();

        Cylinder cylinder1 = new Cylinder(2,6);
        cylinder1.Area();
        cylinder1.perimeter();
        cylinder1.capacity();




    }

}

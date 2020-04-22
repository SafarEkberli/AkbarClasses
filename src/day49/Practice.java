package day49;


abstract class Shape2{
    public abstract void Area();

}
abstract class T extends Shape2{

}

class Triangle extends Shape2{
    public void Area(){
        System.out.println("Area of the triangle is...");
    }

}
public class Practice {
}

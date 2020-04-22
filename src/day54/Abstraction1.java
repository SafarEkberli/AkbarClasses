package day54;
abstract class AbstractClass{
    public static void ByLinkText(){
        System.out.println("Link text super");

    }


}
public class Abstraction1 extends AbstractClass{

    public static void main(String[] args) {
        AbstractClass obj1 = new Abstraction1();
        obj1.ByLinkText();

    }
}

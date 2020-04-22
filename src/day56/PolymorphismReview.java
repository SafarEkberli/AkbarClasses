package day56;

class A{
    public void methodA(){
        System.out.println("method A");
    }
}
class B extends A{
    public void methodB(){
        System.out.println("method B");
    }

}

public class PolymorphismReview {
    public static void main(String[] args) {

        A obj = new A();
        A obj2 = new B();
        obj2.methodA();

         C obj3 = new D();
         E obj4 = new D();



    }

}

abstract class C{


}
class D extends C implements E{

}
interface E{

}

package day54;

public interface InterFace {
    abstract void get();

}
 interface InterFace2 {
    abstract void frame();


}
abstract class  AbsClass{

}
 class Test2 extends AbsClass implements InterFace,InterFace2{
     @Override
     public void frame() {
         System.out.println("Frame");

     }


     @Override
     public void get() {
         System.out.println("Chrome browser");

     }

     public static void main(String[] args) {
         InterFace obj = new Test2();
         obj.get();
         InterFace2 obj2 = new Test2();
         AbsClass obj3 = new Test2();

     }

}

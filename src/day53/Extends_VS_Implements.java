package day53;

interface B{
    abstract void method3();

}

public interface Extends_VS_Implements extends B{
    abstract void method1();
    abstract void method2();

}
 class A implements Extends_VS_Implements {
     @Override
     public void method3() {

     }

     @Override
     public void method1() {

     }

     @Override
     public void method2() {

     }
 }
 class C extends A implements Extends_VS_Implements{

 }

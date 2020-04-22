package day33;

public class MethodCalls {
    public static void main(String[] args) {
        method3();
        max(12,43,23);

    }

    public static void method1(){
        System.out.println("A");
    }
    public static void method2(){
        method1();
        System.out.println("B");
    }

    public static void method3(){
        method2();
        System.out.println("C");
    }

    public static int max(int a, int b,int c){
       int maximum = 0;
        if( a > b && a > c){
            maximum = a;

            System.out.println(a+" is the largest number");

        }else if (b>a && b>c){
            maximum = b;
            System.out.println(b+" is the largest number");
        }else {
            maximum = c;
            System.out.println(c+" is the largest number");
        }
        return maximum;


    }
}

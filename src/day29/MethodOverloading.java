package day29;

public class MethodOverloading {
    public static void main(String[] args) {

        int result = sumOfNums(10,60,50);
        System.out.println(result);

        System.out.println(sumOfNums(50,70,8,6.6));
    }
    public static int sumOfNums(int a, int b){
        return a+b;
    }
    public static int sumOfNums(int a, int b, int c){
        return a+b+c;
    }
    public static double sumOfNums(double a, double b, double c,double d){
        return a+b+c+d;
    }

}

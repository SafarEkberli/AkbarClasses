package day29;

public class OverloadMainMethod {
    public static void main(String[] args) {
     int[] array = {2,3};
        main(array);
    }
    public static void  main(int[] args){
        System.out.println("Int Array");

    }
}

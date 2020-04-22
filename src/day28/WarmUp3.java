package day28;

public class WarmUp3 {
    public static void main(String[] args) {
        Calculator(0,2,"/");

    }

    public static void Calculator(int a, int b , String operator){

        if( a==0 || b==0){
            System.out.println("Invalid entry");
        }
     if(operator.equals("-")){
         System.out.println(a-b);

     }else if(operator.equals("+")){
         System.out.println(a+b);

     }else if(operator.equals("*")){
         System.out.println(a*b);
     }else if(operator.equals("/")){

         System.out.println(a/b);
     }else if(operator.equals("%")){
         System.out.println(a%b);
     }else {
         System.out.println("Invalid");
     }

    }
}

package day48;
class CREDENTIALS{
    private final String UserName = "cybertek";
    private final String PassWord = "Batch12";

    public String getUserName(){
        return UserName;

    }
}

class Holly{
 final    public void printName(){
        System.out.println("Erhan");
    }
}
public class FinalKeyWord extends Holly{
//    @Override
//    public void printName() {
//        System.out.println("Madina");
//    }

    int Age;
    public static void main(String[] args) {
      final   String SSN = "123456";
       // SSN = "654321";
       final String dateOfBirth ;

        FinalKeyWord obj = new FinalKeyWord();

    }
    public static void add(int a,int b){
        System.out.println(a+b);
    }
   public static double add(double x , double y){
        return x+y;
   }

}

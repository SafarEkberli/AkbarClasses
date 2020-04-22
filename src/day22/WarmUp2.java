package day22;

public class WarmUp2 {
    public static void main(String[] args) {

        String original = "levl";
        String Reverse = "";

        for (int i =original.length()-1; i >= 0; i--) {
            Reverse += original.substring(i, i + 1);
        }
            if( Reverse.equalsIgnoreCase(original)){
                System.out.println("Polyndrome");
            }else {
                System.out.println("Not Polyndrome");


        }
        System.out.println(Reverse);



    }
}

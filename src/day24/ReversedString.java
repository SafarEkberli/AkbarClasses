package day24;

public class ReversedString {
    public static void main(String[] args) {
        String name = "Safar";
        String reversedName = "";

        for (int i = name.length()-1; i>=0 ; i--) {
            reversedName += name.charAt(i);



        }
        System.out.println(reversedName);
    }
}

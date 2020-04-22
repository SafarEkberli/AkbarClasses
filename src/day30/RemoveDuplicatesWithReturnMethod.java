package day30;

public class RemoveDuplicatesWithReturnMethod {
    public static void main(String[] args) {
        System.out.println(removeDuplicate("ajskljklsjsl"));

    }

    public static String removeDuplicate(String letter) {

        String word = "";
        for (int i = 0; i < letter.length(); i++) {


            if (!word.contains(letter.substring(i, i +1))){
                 word += letter.substring(i,i+1);

            }
        }return word;
    }
}
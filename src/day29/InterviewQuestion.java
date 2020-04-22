package day29;

public class InterviewQuestion {
    public static void main(String[] args) {
        /* 1. write a method that can find the frequency of characters in String.
        Ex:
        FrequencyTest("XXXYYYZZZ")
        output: X3Y3Z3
         */

        String str = "aabbaaabbbcccccDD";

        String RemoveDup = "";
        for (int i = 0; i <str.length() ; i++) {

            if(!RemoveDup.contains(""+str.charAt(i))){
                RemoveDup += ""+str.charAt(i);
            }

        }
        System.out.println(RemoveDup);

        String result = "";

        for (int j = 0; j <RemoveDup.length(); j++) {


            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.substring(i, i + 1).equals(RemoveDup.substring(j,j+1))) {
                    count++;
                }

            }
            result += RemoveDup.substring(j,j+1)+count;
        }
        System.out.println(result);

        //============================================================
        String input ="XXXYYYZZZ";
        String nonDup = "";
        for (int i = 0; i <input.length() ; i++) {
            if(!nonDup.contains(input.substring(i,i+1))){
                nonDup +=input.substring(i,i+1);
            }

        }
        System.out.println(nonDup);

        for (int j = 0; j <nonDup.length() ; j++) {

          String expectedResult ="";
            int times = 0;
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i)==nonDup.charAt(j)) {
                    times ++;

                }

            }
            expectedResult += ""+nonDup.charAt(j)+times;
            System.out.print(expectedResult);
        }

    }
}

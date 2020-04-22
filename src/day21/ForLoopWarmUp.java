package day21;

public class ForLoopWarmUp {
    public static void main(String[] args) {
        String sentence = "I like books, I have books, I need books";
        int count = 0;
        for (int i = 0; i < sentence.length() - 3; i++) {

            if (sentence.substring(i, i + 4).equals("book")) {
                count++;
            }


        }
        System.out.println(count);

        String s1 = "aabbcc";
        String result = "";
        for (int i = 0; i < s1.length(); i++) {
            if (!result.contains(s1.substring(i, i + 1))) {
                result += s1.substring(i, i + 1);

            }
        }

        System.out.println(result);
        String s2 = "aabbcc";
        String result2 = "";
        for (int i = 0; i < s2.length(); i++) {
            if (!result2.contains(""+s2.charAt(i))) {
                result2 += ""+s2.charAt(i);

            }
        }
        System.out.println(result2);
    }
}

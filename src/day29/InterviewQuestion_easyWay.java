package day29;

public class InterviewQuestion_easyWay {
    public static void main(String[] args) {
        // INCOMPLETE
        String str = "AABBCCDD";
        String expectedR = "";

        for (int j = 0; j < str.length(); j++) {
            int count = 0;

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;

                }

            }

            expectedR += "" + str.charAt(j) + count;
            str = str.replace("" + str.charAt(j), "");
        }
            System.out.println(expectedR);


    }
}
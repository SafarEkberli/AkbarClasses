package day30;

import javax.swing.plaf.IconUIResource;

public class UniqueNumber {
    public static void main(String[] args) {
        System.out.println(uniqueValue("kjahdjkaskl"));

    }
    public static String uniqueValue(String str){

        String result = "";

        for (int j = 0; j <str.length() ; j++) {
            int count = 0;

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i)==str.charAt(j)){
                    count++;

                }
                }if (count==1){
                result += str.charAt(j);

            }
        }
        return result;
    }
}

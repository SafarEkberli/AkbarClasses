package day25;

import java.util.Arrays;

public class toCharArrayMethod {
    public static void main(String[] args) {
        // toCharArray() : returns a char array from the String

        String str = "Java";
        char[] ch = str.toCharArray();
        System.out.println(Arrays.toString(ch));
    }
}

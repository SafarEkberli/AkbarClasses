package day26;

import java.util.Arrays;
import java.util.TreeSet;

public class InterviewQuestion {
    public static void main(String[] args) {
        /*
        1. Write a program that can check if two Strings are build out of same letters.
        Ex:
        if str1 = "aaabbbcc"; str2 ="cab";
        output: true

        if str2 = "abcd"; str2 = "abc";
        output: false

        */

        String  a = "aabbbc";

        String b = "cab";

        String a1 = "";// store all non duplicated values from a.

        String b1 = "";

        for (int i = 0; i < a.length() ; i++) {

            if (!a1.contains(a.substring(i,i+1))){
                a1+= a.substring(i,i+1);


            }

        }
        System.out.println(a1);
        for (int j = 0; j <b.length() ; j++) {
            if(!b1.contains(""+b.charAt(j))){
                b1 += ""+ b.charAt(j);

            }


        }
        System.out.println(b1);

      char[] ch1 =   a1.toCharArray();


      char[] ch2 = b1.toCharArray();


      Arrays.sort(ch1);
      Arrays.sort(ch2);
        String str1 = Arrays.toString(ch1);
        String str2 = Arrays.toString(ch2);
        System.out.println(ch1);
        System.out.println(ch2);

        if(str1.equals(str2)){
            System.out.println(true);
        }else {
            System.out.println(false);
        }

        //2nd solution with Collection

        String st1 = "aaabbbccc";
        String st2 = "cccaaabbb";
        st1 = new TreeSet<String>(Arrays.asList(st1.split(""))).toString();
        st2 = new TreeSet<String>(Arrays.asList(st2.split(""))).toString();
        System.out.println(st1.equals(st2));

    }
}

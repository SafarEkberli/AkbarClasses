package day25;

import java.util.Arrays;

public class StringMethodsWithArray {
    public static void main(String[] args) {
        // split(str);

        //toCharArray();

        String sentence = "Today is great day, Good day to learn java";

       String []arr = sentence.split(" ");
        System.out.println(Arrays.toString(arr));

        String email = "FirstName_LastName";
        String[] arr2 = email.split("_");

        System.out.println(Arrays.toString(arr2));


        String fullname = "Cybertek School Batch12";

      String[] array =  fullname.split(" ");

        System.out.println(Arrays.toString(array));

        String java  = "Java is fun, I love Java";
      String[] array2 =  java.split("Java");
        System.out.println(Arrays.toString(array2));
        System.out.println(array2.length);


        String python = " Python is good, I love Python, Python is life";
        String[] array3 = python.split("Python");
        System.out.println(array3.length-1);

        String emailAddress = "Cybertek_school_batch12@Gmail.com";
      String Fullname =   emailAddress.substring(0,emailAddress.indexOf("@"));

        System.out.println(Fullname);
        String[] AllNames = Fullname.split("_");

        System.out.println(Arrays.toString(AllNames));


        String word = "ABCDEFG";
       String[] Allchars=  word.split("");
        System.out.println(Arrays.toString(Allchars));










    }
}

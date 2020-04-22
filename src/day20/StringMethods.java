package day20;

public class StringMethods {
    public static void main(String[] args) {
        /*
        methods:
        substring, indexOf, lastIndexOf, replace, replaceFirst,
        equals, equalIgnoreCase, contains, startsWith, endsWith,
        charAt, trim, length, concat, isEmpty.
        * */

        String str = "Cybertek School";
       str = str.substring(0, str.indexOf(" "));

        System.out.println(str);

        String str2 = "Cybertek School";
       str2= str2.substring(str2.indexOf("S"));
        System.out.println(str2);


        //index 0f:
        String s1 = "Java is a fun language, I Love Java";
        System.out.println(s1.indexOf("a"));
        System.out.println(s1.indexOf("ag"));

        String name = " Cybertek School Batch 12";
        int length = name.length();
        System.out.println(length);

        name = name.replace(" ","");
        System.out.println(name);
        String sentence = "I love Java";
        sentence = sentence.replace("Java","C++");
        System.out.println(sentence);

        /*
        trim(): remove the unused spaces
         */

        String spaces = "   M    ";
        spaces = spaces.trim();
        System.out.println(spaces);
    }
}

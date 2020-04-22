package day23;

public class ArraysClass {
    public static void main(String[] args) {
        int[] arr = {1,2};
        String [] names = {"Nigar","Sumeyya","Madina","Juline"};

        System.out.println(names[0]);
        System.out.println(names[1]);

       double[]  myArray = {1,2,3,4,5,8,0,2};

        for (int i = 0; i <8 ; i++) {
            System.out.println(myArray[i]+" ");

        }
        System.out.println();
        int[] numbers = {12,24,48,96,2,3,3,4,5,4,2,1,2,4,6,7,};

       int B = numbers.length;
        System.out.println(B);

        for (int i = 0; i <numbers.length ; i++) {
            int s1 = numbers[i];
            System.out.print(s1+" ");

        }
        System.out.println();
        char[] myChars = {'A','B','C','D','E'};
        int length = myChars.length-1;
        System.out.println(length);

    }
}

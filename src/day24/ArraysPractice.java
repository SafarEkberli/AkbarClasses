package day24;

import java.util.Scanner;

public class ArraysPractice {
    public static void main(String[] args) {

        int[] numbers= new int[5];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i <numbers.length ; i++) {
            System.out.println("Enter a number");
            numbers[i] = scan.nextInt();


        }
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum+=numbers[i];


        }
        System.out.println(sum);

        String [] names = {"Seyfo","Asiya","Myra","Kateryna","Daulet"};

        String longestName = "";
        int max = 0;

        for (int i = 0; i <names.length; i++) {

            if(names[i].length()>max){
                max = names[i].length();
                longestName = names[i];

            }

        }
        System.out.println(max);
        System.out.println(longestName);





    }
}

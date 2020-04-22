package day21;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        int a = 9;
        while (a > 6) {
            System.out.println("Hello");
            a--;
        }

        String sentence = "I like book, I read book";
        int count = 0;
        while (sentence.contains("book")) {
            count++;
            sentence = sentence.replaceFirst("book", "");
        }
        System.out.println(count);

        int i = 1;
        while (i <= 100) {

            if (i % 2 == 0) {

                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println();
        Scanner scan = new Scanner(System.in);
        System.out.println("Starting number");
        int start = scan.nextInt();
        System.out.println("Ending number");
        int end = scan.nextInt();

        for (int j = start; j<=end;j++){
            if (j%2==0){
                System.out.println(j);
            }
        }
    }
}
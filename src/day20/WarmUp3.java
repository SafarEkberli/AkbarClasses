package day20;

import java.util.Scanner;

public class WarmUp3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter a number");
            int input = scan.nextInt();
            if (input > max) {
                max = input;
            }

        }
        System.out.println(max);

        int min = 9999999;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter a number");
            int input = scan.nextInt();
            if (input < min) {
                min = input;
            }
        }
        System.out.println(min);
    }
}
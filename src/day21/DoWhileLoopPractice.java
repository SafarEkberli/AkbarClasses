package day21;

import java.util.Scanner;

public class DoWhileLoopPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your first number");
            int a = scan.nextInt();
            System.out.println("Enter your second number");
            int b = scan.nextInt();

            System.out.println("addition is: " + (a + b));
            System.out.println("Do you want to continue");
            String answer = scan.next();
            if (answer.equalsIgnoreCase("no")) {
                break;


            }else {
                System.out.println("Completed");
            }


        }
    }
}
package day20;

import java.util.Scanner;

public class WarmUp2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         int sum = 0;
        for (int i = 1; i <=5 ; i++) {


            System.out.println("Enter your number");
            int inputNum = scan.nextInt();
            sum += inputNum;

        }
        System.out.println("sum is: " + sum);
    }

}

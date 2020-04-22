package day23;

import java.util.Scanner;

public class WhileLoopTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int result = 0;

        while (num1>=num2){
            num1-=num2;
            result++;
        }
        System.out.println("Devision is: "+result+"with a remainder of "+num1);

    }
}

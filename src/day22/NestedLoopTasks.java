package day22;

import java.util.Scanner;

public class NestedLoopTasks {
    public static void main(String[] args) {

while (true) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter two numbers");
    int a = scan.nextInt();
    int b = scan.nextInt();
    System.out.println("Addition is: " + (a + b));
    System.out.println("Do you want to continue");
    String answer = scan.next();

    while(!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))){
        System.out.println("Invalid Entry, please reenter");
        System.out.println("Do you want to continue");
        answer = scan.next();
    }
    if(answer.equalsIgnoreCase("No")){
        break;
    }
}

    }
}

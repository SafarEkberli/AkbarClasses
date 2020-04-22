package day31;

import java.util.Scanner;

public class MaxAndMinNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new  int[3];

        System.out.println("Enter a number: ");
        arr[0] = scan.nextInt();
        System.out.println("Enter a number: ");
        arr[1] = scan.nextInt();
        System.out.println("Enter a number: ");
        arr[2] = scan.nextInt();

        int minValue = arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if(minValue>arr[i]){
                minValue= arr[i];

            }

        }
        System.out.println(minValue);

    }
}

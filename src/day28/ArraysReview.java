package day28;

import java.util.Arrays;

public class ArraysReview {
    public static void main(String[] args) {
        int[] num1D = {1, 2, 3, 4};
        int[] arr = new int[4];
        arr[1] = 10;
        arr[0] = 30;
        arr[2] = 40;
        System.out.println(Arrays.toString(arr));

        int[] numbers = {10, 20, 30, 40};
        for (int each : numbers) {
            if (each == 20) {

                continue;
            }

            System.out.print(each+" ");
             break;
        }
        System.out.println();
        int[] nums1 ={100,200,300,400};


        for (int i = 0; i <nums1.length ; i++) {
            if(nums1[i]==300){
                break;
            }
            System.out.print(nums1[i]+" ");

        }
    }
}
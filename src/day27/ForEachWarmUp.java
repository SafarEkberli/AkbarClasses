package day27;

import java.util.Arrays;

public class ForEachWarmUp {
    public static void main(String[] args) {
        int[] numbers  = new int[100];
         int  numbers1 = 0;
        for (int i = 0; i <numbers.length ; i++) {
            numbers[i] = i+1;


        }
        System.out.println(Arrays.toString(numbers));

        for (int each: numbers){
            if(each %2==0){
                System.out.print(each+" ");
            }
        }
    }
}

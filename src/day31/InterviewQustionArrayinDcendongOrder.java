package day31;

import java.util.Arrays;

public class InterviewQustionArrayinDcendongOrder {
    public static void main(String[] args) {
        int [] arr = {10};

        int[] arr2 = new int[2];

        System.out.println(Arrays.toString(arr2));

        String[] cars = {"Ford","Honda","BMW","Volvo","Volkswagen"};


        boolean[] bool = {10>9,"Mikray".equals("Seyfo")};

        int[] numbers = {200,300,20,7890,40,-9,-100};
        Arrays.sort(numbers);
        String result= "";
        for (int i = numbers.length-1; i >=0 ; i--) {
            result += numbers[i]+", ";



        }
        result= result.substring(0,result.lastIndexOf(","));
        System.out.print(result);


    }
}

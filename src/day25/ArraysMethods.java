package day25;

import java.util.Arrays;

public class ArraysMethods {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
      String str =  Arrays.toString(arr);

        System.out.println(str);

        int [] nums ={2,5,67,89,5,3,1};

       Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        System.out.println("Maximum: "+nums[nums.length-1]);
        System.out.println("Minimum: "+nums[0]);

        String [] names ={"Safar","Akbar","Salim","Adila"};
        Arrays.sort(names); // it is sorted in alphabetical order.
        System.out.println(Arrays.toString(names));

        int [] numbers = {2000,90,89,78,65,5555,444,-5};
        Arrays.sort(numbers);
        System.out.println("Maximum: "+numbers[numbers.length-1]);
        System.out.println("Minimum: "+numbers[0]);

        int[] MyNumbers = {90,10,200,3000,40,50,5000};
        Arrays.sort(MyNumbers);
        System.out.println(Arrays.toString(MyNumbers));
        for (int i = MyNumbers.length-1; i >=0 ; i--) {
            System.out.println(MyNumbers[i]);


        }


            int[] arr2  = {99,10,200,40,50,60,70};
            Arrays.sort(arr2);
            int[] arr3 = new int[arr2.length];
            int z = 0;

           for (int j = arr2.length-1; j >=0 ; j--) {
                arr3[z]= arr2[j];
                z++;


            }
            System.out.println(Arrays.toString(arr2));
            System.out.println(Arrays.toString(arr3));

        }
    }


package day29;

import java.util.Arrays;

public class ReturnMethodPractice {
    public static void main(String[] args) {

        System.out.println(sum(10, 30));
      int max =(int)  greaterNumber(90,20,30);
        System.out.println(max);
        int[] arr = {20,30,1,2,3,5,9};
        int maxNum = maximum(arr);
        System.out.println(maxNum);

        String[] names = {"Emrah","Zulfiyye","Mehmet","Yusuf"};
        String longname = longestWord(names);

        System.out.println(longname);

        int[] array={1,4,6,3,8,2};
        array = Sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static int sum(int a, int b) {

        return a + b;

    }
    public static double greaterNumber(int a, int b, int c){
        int[] arr = {a,b,c};
        Arrays.sort(arr);
        return arr[arr.length-1];
    }

    public static  int maximum(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }

    public static String longestWord(String[] arr){

        String longWord = "";
        int max = 0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i].length()>max){
                max = arr[i].length();
                longWord= arr[i];
            }


        }
        return longWord;
    }

    public static int[] Sort (int[]arr){

        Arrays.sort(arr);
        int[] nums = new int[arr.length];
        int z = 0;
        for (int i = arr.length-1; i >=0 ; i--) {
            nums[z] = arr[i];
            z++;




        }
        return nums;
    }
}
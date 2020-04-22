package day26;

import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);

        }
        System.out.println("==================");
        for(int each:arr){
            System.out.println(each);
        }
        System.out.println();
        String[] str1 = {"a","b","c","d","e"};
        for (String each: str1){
            System.out.print(each+" ");
        }
        char[] ch = {'z','x','y','c','a','b'};
        Arrays.sort(ch);
        for (char each: ch){
            System.out.print(each+" ");
        }
        System.out.println();
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};

        for (int each: arr1){
            if(each%2==0){
                System.out.print(each+" ");
            }
        }

    }
}

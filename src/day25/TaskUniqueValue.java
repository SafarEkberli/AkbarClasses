package day25;

public class TaskUniqueValue {
    public static void main(String[] args) {


        int[] arr = {1, 2,  4, 2, 3, 5};

        for (int j = 0; j < arr.length; j++) {
            int count = 0;// to find out how many times a value is appeared in the array.

            for (int i = 0; i < arr.length; i++) {

                if (arr[i] ==arr[j]){// compares each index of the array with the given value.
                    count++;
                }
            }
            if(count==1){
                System.out.println(arr[j]);
            }
        }
    }
}
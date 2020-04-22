package day24;

public class ArrayClass {
    public static void main(String[] args) {
         int a = 10;

         int[] arr = {10,20,30};

         int[] arr2 = {10,20,30};

         char[] arr3 = {'A','B','C'};

         String[] arr4 = {"Ibrahim","Filiz","Aysel"};

         String name = arr4[2];

         int[] array1 = {1,2,3};
         int[] array2 = {4,5,6};

         int[] array3 = new int[array1.length+array2.length];

        for (int i = 0; i <array1.length ; i++) {
            array3[i] = array1[i];

        }
        for (int i = 0; i <array3.length ; i++) {
            System.out.println(array3[i]+" ");

        }

    }
}

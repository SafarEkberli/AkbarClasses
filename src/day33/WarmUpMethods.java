package day33;

import java.util.Arrays;

public class WarmUpMethods {
    public static void main(String[] args) {
        int[] arr = {3, 2, 6, 7, 23, 21, 15, 74};
        arr = SortDe(arr);
        System.out.println(Arrays.toString(arr));

        String[] names = {"Adila","Safar","Farhad","Gunel"};
        names = SortDe(names);
        System.out.println(Arrays.toString(names));

    }

    public static int[] SortDe(int[] arr) {
        Arrays.sort(arr);
        int[] arr2 = new int[arr.length];
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            arr2[j] = arr[i];
            j++;

        }
        return arr2;
    }

    public static double[] SortDe(double[] arr) {

        Arrays.sort(arr);
        double[] arr2 = new double[arr.length];
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            arr2[j] = arr[i];
            j++;


        }

        return arr2;
    }

    public static String[] SortDe(String[] arr) {
        Arrays.sort(arr);
        String[] arr2 = new String[ arr.length];
       int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            arr2[j] = arr[i];
            j++;

        }
        return arr2;
    }
}
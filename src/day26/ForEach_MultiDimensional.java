package day26;

import java.util.Arrays;

public class ForEach_MultiDimensional {
    public static void main(String[] args) {
        // n dimensional array contains (n-1) dimensional arrays.

        int[] arr1D = {1, 2, 3, 4};
        int[][] arr2D = {{1, 2, 3}, {5, 6, 7, 8}};

        for (int i = 0; i < arr2D.length; i++) {
            //counts the 1D arrays.
            for (int j = 0; j < arr2D[i].length; j++) {

                System.out.println(arr2D[i][j]);

            }

        }

        for (int[] each : arr2D) {
            for (int each2 : each) {

                System.out.print(each2 + " ");

            }
        }

        System.out.println();
        String[][] str2D = {{"Bibi", "Sayfo"}, {"Syfooo", "Julia"}};
        for (String[] each1 : str2D){
            for (String each2 : each1){
                System.out.println(each2);

            }
        }
        int[][] num2D = {{1,2},{3,4}};
        int[][][] num3D = {{{1,2},{3,4}},{{5,6},{7,8}}};

        for (int[][] each1DArray: num3D){
            for (int[] each2DArray: each1DArray){
                for (int each3dArray: each2DArray){
                    System.out.print(each3dArray+ " ");
                }
            }
        }
        System.out.println();
      }
}
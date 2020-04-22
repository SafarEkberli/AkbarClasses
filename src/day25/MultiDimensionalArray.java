package day25;

import java.util.Arrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        int[][] arr2D = {{1,2,3},{4,5,6}};
        String[] arr = {"A","B"};
        //                    0   1     0  1
        String[][] str2D = {{"A","B"},{"C","D"}};
       //                       0       1
        // first bracet represents array

        System.out.println(str2D[0][1]);
        System.out.println(str2D[1][0]);

        System.out.println(Arrays.deepToString(str2D));

        int[][] Array2D = {{1,2},{3,4}};

        int[][][]Array3D = {{{1,2},{3,4}},{{1,2},{3,4}}};

        System.out.println(Array3D[1][1][1]);
        System.out.println(Arrays.toString(Array3D[1][0]));

        System.out.println(Arrays.deepToString(Array3D[1]));
        System.out.println(Arrays.deepToString(Array3D));
    }
}

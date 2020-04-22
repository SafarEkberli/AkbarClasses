package day25;

import java.util.Arrays;

public class Practice_2DArray {
    public static void main(String[] args) {
        int[][] arr2D = {{1, 2}, {3, 4}};
        int length = arr2D.length;
        for (int i = 0; i < arr2D.length; i++) {
            System.out.println(Arrays.toString(arr2D[i]));


        }
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D.length; j++) {


                System.out.print(arr2D[i][j]+" ");

            }
        }
        System.out.println();
        char[][] char2D = {{'A','B'},{'C','D'}};
        for (int i = 0; i <char2D.length ; i++) {

            for (int j = 0; j <char2D.length ; j++) {
                System.out.println(char2D[i][j]);

            }

        }
    }
}
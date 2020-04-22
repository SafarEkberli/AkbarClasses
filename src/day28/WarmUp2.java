package day28;

import com.sun.tools.internal.xjc.model.CArrayInfo;

import java.util.Arrays;

public class WarmUp2 {
    public static void main(String[] args) {
        int[] array = {0,1,200,3,2,5};
        SortDes(array);

    }
    public static void SortDes(int[] array){
        Arrays.sort(array);
        for (int i = array.length-1; i >=0 ; i--) {
            System.out.print(array[i]+" ");

        }
    }
}

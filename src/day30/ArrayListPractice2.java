package day30;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListPractice2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i <=40 ; i+=2) {
            list.add(i);


        }
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(4));

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");

        }
        System.out.println();

            for (Integer each: list){
                System.out.print(each+" ");
            }

            //Sorting the Arraylist

        Collections.sort(list);


    }
}

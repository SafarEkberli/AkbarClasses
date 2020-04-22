package day57;

import java.util.ArrayList;
import java.util.Arrays;

public class ExceptionHandling {


    public static void main(String[] args) {
         int[] number = {100,200,300};
      try {
          System.out.println(number[5]);
          System.out.println("Try block, Checked exception");
      } catch(ArrayIndexOutOfBoundsException e){
          System.out.println("Catch block, Unchecked exception");

      }

        System.out.println("=====================================");
     try {
            Thread.sleep(2000);
         System.out.println("Try block, Checked exception");
     } catch (InterruptedException e) {
         e.printStackTrace();
         System.out.println("Catch block, Unchecked exception");
     }
        System.out.println("Work Done");


        ArrayList<Integer> list = new ArrayList<Integer>();
        list.addAll(Arrays.asList(1,2,3));
        try {


            System.out.println(list.get(10));
            System.out.println("Try block, Checked exception");

        }catch (IndexOutOfBoundsException e){
            System.out.println("unchecked Exception occurred in arrayList");
        }

    }
}

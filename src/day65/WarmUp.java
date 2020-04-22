package day65;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class WarmUp {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(2,3,4,5,6,7,8,9));

        for(Iterator<Integer> it = list1.iterator(); it.hasNext();){
          int a =  it.next();
          if(a%2==0){
              it.remove();
          }

        }
        System.out.println(list1);

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2));
        Iterator<Integer> it2 = list2.iterator();
       while (it2.hasNext()){
           int b = it2.next();
           if (b%2==0){
               it2.remove();
           }
       }



    }
}

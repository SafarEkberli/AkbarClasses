package day65;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LandaExpressions {
    public static void main(String[] args) {
        Predicate<Integer> remove100 = p -> p == 100;
        List<Integer> list1 = new ArrayList<>(Arrays.asList(100,100,100,100,100,100));
        list1.removeIf(remove100);

        System.out.println(list1);

        List<Integer> list2 = new ArrayList<>(Arrays.asList(100,200,300,400,500,600));
        list2.removeIf(R-> R >300);
        System.out.println(list2);


    }
}

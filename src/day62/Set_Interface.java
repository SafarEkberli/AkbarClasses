package day62;

import java.util.*;

public class Set_Interface {
    public static void main(String[] args) {

        Set<Integer> st1 = new HashSet<>();
        st1.add(100);
        st1.add(100);
        st1.add(100);

        System.out.println(st1);

        Set<Integer> hashSet = new HashSet<Integer>();

        hashSet.add(100);
        hashSet.add(3);
        hashSet.add(60);
        hashSet.add(25);

        System.out.println(hashSet);

        Set<Integer> lHashSet = new LinkedHashSet<Integer>();

        lHashSet.add(100);
        lHashSet.add(3);
        lHashSet.add(60);
        lHashSet.add(25);

        System.out.println(lHashSet);

        SortedSet<String> treeSet = new TreeSet<>();
        treeSet.add("Z");
        treeSet.add("Y");
        treeSet.add("X");
        treeSet.add("W");

        System.out.println(treeSet);





    }
}

package day62;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.*;

public class List_Interface {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<Double> list3 = new ArrayList<>();

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.remove(1);

        System.out.println(arrayList);

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.remove(1);
        System.out.println(linkedList);

        System.out.println("========================");

        String[] arr = {"A","B","C","D"};

        List<String> notLinked = new ArrayList<>(Arrays.asList(arr));

        LinkedList<String> Linked = new LinkedList<>(Arrays.asList(arr));
        System.out.println(Linked);

        Vector<Integer> vt = new Vector<>();
        vt.add(1);

        System.out.println("============");

        Stack<Integer> st = new Stack<Integer>();
        st.add(1);
        st.add(2);
        st.add(3);
        st.add(4);

        System.out.println(st);
        System.out.println(st.pop());
        System.out.println(st);
        System.out.println(st.pop());
        System.out.println(st);



    }
}

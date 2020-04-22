package day64;

import java.util.*;

public class Iterable_Interface {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 1, 1, 1, 1, 2, 3, 4, 5, 6, 7, 1, 1, 1, 1));

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 1) {
                list.remove(i);

            }


        }
        System.out.println(list);
        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1, 1, 1, 1, 1, 2, 3, 4, 5, 6, 7, 1, 1, 1, 1));
        Iterator<Integer> it = list2.iterator();
        while (it.hasNext()) {
            int num = it.next();
            if (num == 1) {
                it.remove();

            }

        }
        System.out.println(list2);

        Set<Integer> set = new LinkedHashSet<Integer>();

        set.addAll(Arrays.asList(10, 20));
        Iterator<Integer> iterate = set.iterator();
        System.out.println(iterate.hasNext());
        System.out.println(iterate.next());


        String[] students = {"Erhan", "Medina", "Erhan", "Aijamal"};
        List<String> nameList = new ArrayList<String>();
        nameList.addAll(Arrays.asList(students));
        for (Iterator<String> itr = nameList.iterator(); itr.hasNext(); ) {
            String str = itr.next();
            if (str.equals("Erhan") || str.equals("Madina")) {
                itr.remove();
            }
        }
            System.out.println(nameList);
        }

    }

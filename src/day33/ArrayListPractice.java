package day33;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<String> shoppingList = new ArrayList<>();

        shoppingList.add("apple");
        shoppingList.add("orange");
        shoppingList.add("grape");
        shoppingList.add(0,"strawberry");
        shoppingList.set(0,"Kiwi");
        System.out.println(shoppingList);


        ArrayList<String> names = new ArrayList<>();
        names.add("Homayra");
        names.add("Meri");
        names.add("Mikriigul");
        names.add("Tabriz");
        names.add("Asya");

        String str = names.get(1);
        System.out.println(str);

        for (int i = 0; i <names.size() ; i++) {
            String each = names.get(i)+" ";
            System.out.print(each);


        }
        System.out.println();
        ArrayList<String> Javengers = new ArrayList<>();
        Javengers.add("Ferhad");
        Javengers.add("Adila");
        Javengers.add("Gunel");
        Javengers.add("Hasan");
        Javengers.add("Safar");

        Javengers.set(0,"Gul");
        System.out.println(Javengers);

        ArrayList<String> goodGuys = new ArrayList<>();
        goodGuys.add("Hakan");
        goodGuys.add("Ihsan");
        goodGuys.add("Tim");
        goodGuys.add("Ibrohim");
        goodGuys.add("Dilyar");

        System.out.println( goodGuys.contains("Muhtar"));

        ArrayList<String> badGuys = new ArrayList<>();
        badGuys.add("Muhtar");
        badGuys.add("Asya");
        badGuys.add("Guljannat");

        System.out.println( badGuys.equals(goodGuys));

        ArrayList<Integer> lists = new ArrayList<>();
        lists.add(1);
        lists.add(2);
        lists.add(3);
        lists.add(4);
        lists.add(5);

        lists.remove(1);
        System.out.println(lists);

        ArrayList<String>  city= new ArrayList<>();
        city.add("Miami");
        city.add("Gotham");
        city.add("Baku");
        city.add("Istanbul");
        city.add("Urumqi");

        city.remove("Miami");
        city.remove(2);
        System.out.println(city);


        ArrayList<Integer> price = new ArrayList<>();
        price.add(1);
        price.add(2);
        price.add(3);
        price.add(4);
        price.add(5);

        price.remove(Integer.valueOf(2));
        System.out.println(price);



    }
}

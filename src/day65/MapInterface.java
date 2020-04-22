package day65;

import java.util.*;

public class MapInterface {
    public static void main(String[] args) {
        Map<String,Double> employees = new HashMap<>();
        employees.put("Nurullah",2000.99);
        employees.put("Alla",12000.77);
        employees.put("Erhan",4000.9);

        System.out.println(employees);
        employees.get("Nurullah");
        System.out.println(employees);
        double salary1 = employees.get("Nurullah");
        System.out.println(salary1);
        System.out.println(employees.get("Erhan"));

        employees.remove("Nurullah");

        System.out.println(employees);
        System.out.println(employees.size());

        System.out.println(employees.containsValue("78908.0"));

        Set<String> set = employees.keySet();
        System.out.println(set);

        Map<String ,Integer> map1 = new LinkedHashMap<>();
        map1.put("A",100);
        map1.put("C",100);
        map1.put("B",9);
        map1.put("A",8);
        System.out.println(map1);

        Hashtable<String ,Integer> map2 = new Hashtable<>();
        map2.put("A",7000);
        System.out.println(map2);

        TreeMap<String,Integer> map3 = new TreeMap<>();
        map3.put("Z",1000);
        map3.put("Y",90000);
        map3.put("X",60000);

        System.out.println(map3);
    }
}

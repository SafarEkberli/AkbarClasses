package day30;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();

        nameList.add("Homayra");
        nameList.add("Apple");
        System.out.println(nameList);


        ArrayList<String> studentNames = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the student's name");
        String name = scan.nextLine();

            studentNames.add(name);
        System.out.println("Do you want to add another name");
        String answer = scan.nextLine();
        if(answer.equalsIgnoreCase("no")){
            System.out.println();


        }


    }
}

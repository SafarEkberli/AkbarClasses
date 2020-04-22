package day19;

import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your username");
        String user = scan.nextLine();
        System.out.println("Enter your password");
        String pass = scan.nextLine();
        String username = "cybertek.batch@gmail.com";
        String password = "Javengers";

        if(user.endsWith("@gmail.com")){
            if(user.equalsIgnoreCase(username) && pass.equalsIgnoreCase(password)){
                System.out.println("Loged in successfully");
            }

        }else {
            System.out.println("It is not valid email address");
        }




    }
}

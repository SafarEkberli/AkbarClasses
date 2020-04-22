package day60;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptions_review {
    public static void main(String[] args) {

        try {

            Thread.sleep(3000);
            System.out.println("try block");
        } catch (Exception e) {
            System.out.println("catch block");

        }
    }
}

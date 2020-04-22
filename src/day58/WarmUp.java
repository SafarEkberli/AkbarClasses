package day58;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Properties;

public class WarmUp {
    public static void main(String[] args) {
        Wait(2.5);
   String age1 =      getData("Age", "/Users/safarmaharramov/IdeaProjects/AkbarClasses/TestData");
        System.out.println(age1);
    }

    public static void Wait(double seconds){
        try {
            Thread.sleep((long) (seconds*1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static String getData(String Key, String Path){
        Properties property = new Properties();

    try{
        FileInputStream file = new FileInputStream(Path);

            property.load(file);
        } catch (IOException e) {

        }

        return property.getProperty(Key);
    }
}

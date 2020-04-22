package day28;

public class WarmUp1 {
    public static void main(String[] args) {
      convertKmToMiles(7);
      GallonsToLitters(9);

    }
    public static void convertKmToMiles(double km){
      double    miles = km* 0.612;
        System.out.println(km+" km equals to "+miles+" miles");
    }
    public  static void GallonsToLitters(double lt){
        double gallon = lt*3.75;
        System.out.println(lt+" lt equals to "+gallon+" gallons");
    }
}

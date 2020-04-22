package day53;

public class Dealership {
    public static void main(String[] args) {


        Tesla_Model3 obj1 = new Tesla_Model3();
        obj1.start();
        obj1.Fly();
        obj1.Charge();
        obj1.SelfDrive();
        System.out.println("========================");

        Jeep_Wrangler obj2 = new Jeep_Wrangler();
        obj2.PumpGas();
        obj2.SelfParking();
        obj2.start();
        System.out.println("========================");

        ToyotaHybrid obj3 = new ToyotaHybrid();
        obj3.Charge();
        obj3.Fly();
        obj3.PumpGas();
        obj3.SelfDrive();
        obj3.SelfParking();


    }
}
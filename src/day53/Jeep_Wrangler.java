package day53;

public class Jeep_Wrangler implements Cars, GasVehicles {
    public void start(){
        System.out.println("Call Mechanic");
        System.out.println("Change Oil");
        System.out.println("Jump Start");
    }
    public void PumpGas(){
        System.out.println("Pumping Gas");
    }

    @Override
    public void SelfParking() {
        System.out.println("Self parking mode");
    }
}

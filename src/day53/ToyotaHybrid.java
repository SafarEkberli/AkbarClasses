package day53;

public class ToyotaHybrid implements Cars, GasVehicles, ElectricVehicles {
    @Override
    public void start() {
        System.out.println("push start button");

    }

    @Override
    public void Charge() {
        System.out.println("Charging");

    }

    @Override
    public void SelfDrive() {
        System.out.println("Self Driving mode");

    }

    @Override
    public void PumpGas() {
        System.out.println("Pumping gas");

    }

    @Override
    public void Fly() {
        System.out.println("Toyota flies");

    }

    @Override
    public void SelfParking() {
        System.out.println("Self parking mode");

    }
}

package day49;

public abstract class Abstraction {
    public abstract void startTheCar();


}
class A extends Abstraction {

    public void startTheCar() {
        System.out.println("Brake");
        System.out.println("Push the start button");
        System.out.println("Release the brake");
    }
}
class Tesla extends  Abstraction{

    public void startTheCar(){
        System.out.println("Voice control");
        System.out.println("Drive");



}
}

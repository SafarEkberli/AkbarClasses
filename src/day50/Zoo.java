package day50;

public class Zoo {
    public static void main(String[] args) {


        Cat Cleo = new Cat('f', (byte) 5, "white", "Cleo");

//        System.out.println("Name is "+Cleo.nickName);
//        System.out.println("Color is "+Cleo.color);
//        System.out.println("Gender is "+Cleo.Gender);
//        System.out.println("Age is "+Cleo.Age);

        System.out.println("=======================");
        Cleo.getInfo();
        Cleo.Sleep(14);
        Cleo.Eat("fish");
        Cleo.Drinks("milk");
        Cleo.Speak("meow");
        System.out.println("==========================");

        Dog misha = new Dog('m', (byte) 5, "black", "Misha");
        misha.getInfo();
        misha.Sleep(9);
        misha.Eat("chicken");
        misha.Drinks("water");
        misha.Speak("woof");

        Dog Gisha = new Dog('m', (byte) 5, "black", "Gisha");
        Gisha.getInfo();
        Gisha.Sleep(9);
        Gisha.Eat("chicken");
        Gisha.Drinks("water");
        Gisha.Speak("woof");


        Dog[] dogs = {misha,Gisha};
        dogs[1].getInfo();

    }
}
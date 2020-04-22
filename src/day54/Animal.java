package day54;

public class Animal {
    public void talk(){
        System.out.println("Animal is talking");

    }
}
class Tiger extends Animal{
    public void Hunt(){
        System.out.println("Tiger is hunting");
    }

    public void talk() {
        System.out.println("Tiger speaks Roar");
    }
}
 class Octopus extends Animal{
    public void Swim(){
        System.out.println("Tiger is hunting");
    }


    public void talk() {
        System.out.println("Octopus talk gologolo");
    }

        }
 class Zoo{
            public static void main(String[] args) {
                Tiger tiger1 = new Tiger();

                Tiger[] Tigers ={tiger1, new Tiger()};

                Octopus octopus1 = new Octopus();
                Octopus[] octopus = {octopus1, new Octopus()};

                Animal animal1 = new Tiger();
                Animal animal2 = new Octopus();
                animal2.talk();
            }
    }


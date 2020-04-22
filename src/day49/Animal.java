package day49;

public abstract class Animal {
    public  abstract void eat();
    public abstract void sleep();
}

class Cat extends Animal {
    public void eat() {
        System.out.println("Cat eats fish");

    }

    public void sleep() {
        System.out.println("Cat sleeps 14 hours");

    }
}
    class KingKong extends Animal {
        public void eat() {

            System.out.println("KingKong eats human");
        }

        public void sleep() {

            System.out.println("KingKong sleeps 5 hours");


        }
    }
        class Test {
            public static void main(String[] args) {


                KingKong obj = new KingKong();
                obj.eat();
                obj.sleep();
                Cat obj2 = new Cat();
                obj2.eat();
                obj2.sleep();


            }
        }

package day50;

public class Dog extends Animal{

         public Dog(char gender, byte age, String color, String nickName){
            super(gender, age, color, nickName);

        }


        public void Speak(String language){

            System.out.println(nickName+" speaks "+language);
        }
        public void Sleep(int hour){
            System.out.println(nickName+" sleeps "+hour+" hours");
        }

        public void Eat(String food){
            System.out.println(nickName+" eats "+food);
        }
        public void Drinks(String drink){
            System.out.println(nickName+" drinks "+drink);
        }
    }




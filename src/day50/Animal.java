package day50;

public abstract class Animal {

    public char Gender;
    public byte Age;
    public String color;
    public String nickName;

    public Animal(char gender, byte age, String color, String nickName) {
        this.Gender = gender;
        this.Age = age;
        this.color = color;
        this.nickName = nickName;
    }

    public  abstract void Speak(String language);
    public abstract void Sleep(int hour);
    public  abstract void Eat(String food);
    public abstract void Drinks(String drink);

    public void getInfo(){
        System.out.println("NickName is "+nickName);
        System.out.println("Gender is "+Gender);
        System.out.println("Color is "+color);
        System.out.println("Age is "+Age);
    }
}



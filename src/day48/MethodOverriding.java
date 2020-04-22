package day48;
class student{
    public void printName(){
        System.out.println("Hakan");
    }
}

public class MethodOverriding  extends student{
    public void print(String str){

    }
    public void print(double a){

    }
//    public void print (String str){ overriding can not happen at the same class.


    @Override
    public void printName() {
        System.out.println("Shukran");
    }

    public static void main(String[] args) {

        MethodOverriding obj = new MethodOverriding();
        obj.printName();
        student obj2 = new student();
        obj2.printName();


    }
//
//    }
}

package day48;


class Mahribana {
    void methodA() {
        System.out.println("Method A");
    }

    public double salary(double bonus) {
        return bonus + 1000;
    }
}
public class AccessModifiers extends  Mahribana{
    @Override
    public double salary(double bonus) {
        return bonus +10000;
    }

    @Override
    void methodA() {
        System.out.println("Method A");
    }
}

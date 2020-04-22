package day48;

public class Bank {
    public void InterestRate(){
        System.out.println("9 percent");
    }

    public static void main(String[] args) {
        BankOfAmerica BOA = new BankOfAmerica();
        BOA.InterestRate();

        Chase ch = new Chase();
        ch.InterestRate();

        CapitalOne co = new CapitalOne();
        co.InterestRate();
    }

}

class BankOfAmerica extends Bank{

    public void InterestRate() {
        System.out.println("5 percent");
    }
}
class Chase extends Bank {
    public void InterestRate() {
        System.out.println("6 percent");
    }

}
class CapitalOne extends Bank{
    public void InterestRate() {
        System.out.println("4 percent");
    }


}

package day21;

public class DoWhileLoop {
    public static void main(String[] args) {

        int x= 1;
        do{ if(x%2==0){
            System.out.print(x+" ");
        }
         x++;
        }while (x<=50);
        System.out.println();

        do{
            System.out.println("Hello World");
            break;
        }while (true);
    }
}

package day19;

public class Tasks {
    public static void main(String[] args) {
        for (int i = 2; i <= 32; i += 2) {
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i = 1; i <= 32; i++) {
            if (i % 2 == 1) {
                System.out.print(i+" ");

            }
        }
        System.out.println();
        String str = "Java";
        String rev2 ="";
        for (int i = str.length()-1; i >=0 ; i--) {
            rev2 += str.charAt(i);


        }
        System.out.println(rev2);
    }

}
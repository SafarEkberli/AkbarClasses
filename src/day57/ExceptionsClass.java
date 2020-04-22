package day57;

public class ExceptionsClass {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(arr[100]);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

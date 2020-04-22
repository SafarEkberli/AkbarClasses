package day25;

public class UniqueValueStringArray {
    public static void main(String[] args) {
        String[] arr = {"A", "A", "B", "C", "D"};

        for (int j = 0; j < arr.length; j++) {


            int count = 0;
            for (int i = 0; i < arr.length; i++) {

                if (arr[i].equals(arr[j])){
                    count++;
                }

            }
            if(count==1){
                System.out.println(arr[j]);
            }
        }
    }
}
package day22;

public class NestedLoopStairInterview {
    public static void main(String[] args) {
//        for (int i = 1; i <=5 ; i++) {
//
//            for (int j = 1; j <=5 ; j++) {
//                System.out.print(j);
//
//            }
//            System.out.println();


            for (int j = 1; j <=5 ; j++) {
                for (int k = 1; k <= j; k++) {

                    System.out.print("*");

                }
                System.out.println();
            }


        for (int i = 7; i>=1;i--){

            for (int k = i; k >=1 ; k--) {
                System.out.print("*");

            }
            System.out.println();
        }

            }

        }



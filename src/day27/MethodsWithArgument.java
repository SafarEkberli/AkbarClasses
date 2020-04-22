package day27;

public class MethodsWithArgument {
    public static void main(String[] args) {
        oddNumberOrEven(45);
        sumOfNumbers(8,90);
        removeDuplicates("aaaabbbbccccdddd");

    }
    public static void removeDuplicates(String word){
        String unique = "";
        for (int i = 0; i <word.length() ; i++) {
            if (!unique.contains(""+word.charAt(i))){
                unique += ""+word.charAt(i);
            }


        }
        System.out.println(unique);
    }
    public static void sumOfNumbers(int a, int b){
        int sum = a+b;
        System.out.println(sum);
    }
    public static void oddNumberOrEven(int number){
        if (number%2==0){
            System.out.println(number+"Even number");
        }else {
            System.out.println("Odd number");
        }
        }
    }


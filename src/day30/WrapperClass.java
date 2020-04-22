package day30;

public class WrapperClass {
    public static void main(String[] args) {
        int numInt = 10;
        Integer numInteger = 10;

        double numdouble = 5.5;
        Double numDouble = 5.5;

        long numlong = 20l;
        Long numLong = numlong; //AutoBoxing(Converting primitives to the wrapper class)

        Boolean Booleanresult = false;
        boolean booleanresult = Booleanresult; //Unboxing(Converting wrapper class value to the primitive)



    }
}

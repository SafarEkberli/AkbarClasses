package day22;

public class WarmUpLoop {
    public static void main(String[] args) {
        String str1 = "";
        for (int i = 1; i <=30 ; i++) {

            if(i%3==0 && i%5 ==0){
               str1 += "FinRa ";
            }else if (i%3==0){
                str1 += "Fin ";
            }else if (i%5==0){
                str1 += "Ra ";
            }else {
                str1 += i+" ";
            }

        }
        System.out.print(str1);

        System.out.println();
        String str = "";
        int j = 1;
        while (j<=30){
            if(j%3==0 && j%5 ==0) {
                str += "FINRA ";
            }else if(j%3==0){
                str += "FIN ";

            }else if(j%5==0) {
                str +="Ra ";
            }else {
                str += j+" ";
            }
            j++;

        }
        System.out.print(str);


    }
}

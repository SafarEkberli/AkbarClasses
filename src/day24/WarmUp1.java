package day24;

public class WarmUp1 {
    public static void main(String[] args) {
        int[] nums = {5,7,9,95,38};
        int max = 0;


        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]>max){
                max = nums[i];

            }

        }
        System.out.println(max);

        int secondMax = 0;
        for (int j = 0; j < nums.length; j++) {
            if(nums[j]> secondMax && nums[j]!= max){
                secondMax = nums[j];


            }

        }
        System.out.println(secondMax);


        }
    }


import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        //given array and target
        int[] nums = {1,2,3,4};
        int target = 5;
        //My solution
        int sum = 0;
        int[] result = new int[2];
        for(int i = 0; i < nums.length - 1; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                sum = nums[i] + nums[j];
                if(sum == target) {
                    result[0] = i;
                    result[1] = j;
                } else {
                    sum = 0;
                }
            }
        }
        for(int i : result) {
            System.out.println(i);
        }
    }
}

import java.util.Arrays;

public class twoSum {
    public static void main(String[] args) {
            int []arr={2,4,5,6,7,8,9};
        int target=6;
        System.out.println(sum(arr,target));

    }
    static int[] sum(int[]sums,int target){
        for (int i = 0; i < sums.length-1; i++) {
            for (int j = i+1; j < sums.length ; j++) {
                if(sums[i] + sums[j] == target){
                    return new int []{i,j};
                }

            }
        }
        return new int[]{};
    }
}


//public int[] twoSum(int[] nums, int target) {
//        for (int i = 0; i < nums.length; i++) {
//        for (int j = i + 1; j < nums.length; j++) {
//        if (nums[j] == target - nums[i]) {
//        return new int[] { i, j };
//        }
//        }
//        }
//        // In case there is no solution, we'll just return null
//        return null;
//        }
//        }
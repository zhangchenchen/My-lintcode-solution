import java.util.*;
public class MaxTwoSubArraysSolution {
    /**
     * @param nums: A list of integers
     * @return: An integer denotes the sum of max two non-overlapping subarrays
     */
    public static int maxTwoSubArrays(ArrayList<Integer> nums) {
        // write your code
        
        int len = nums.size();
        if(nums == null || len == 0 || len ==1){
            return 0;
        }
        int[] rightLocal = new int[len];
        rightLocal[len - 1] = nums.get(len - 1);
        for(int i = len -2; i>= 0; i--){
            rightLocal[i] = Math.max(nums.get(i), rightLocal[i + 1] + nums.get(i));
            System.out.println(rightLocal[i]);
        }
        System.out.println("---------------");
        int[] leftGlobal = new int[len];
        int leftLocal = nums.get(0);
        leftGlobal[0] = nums.get(0);
        for(int i = 1; i < len; i++){
            leftLocal = Math.max(nums.get(i), leftLocal + nums.get(i));
            leftGlobal[i] = Math.min(leftGlobal[i - 1], leftLocal);
            System.out.println(leftGlobal[i]);
        }
        int max = Integer.MIN_VALUE;
        for(int i = len - 1; i > 0; i--){
            max = Math.max(max, rightLocal[i] + leftGlobal[ i - 1]);
        }
        return max;
    }



    
    public static void main(String[] args) {
    ArrayList<Integer> nums = new ArrayList<Integer>();
nums.add(1);
nums.add(3);
nums.add(-1);
nums.add(2);
nums.add(-1);
nums.add(2);    
    maxTwoSubArrays(nums);
    }
};
    
 

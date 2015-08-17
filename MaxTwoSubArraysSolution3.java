import java.util.*;
public class MaxTwoSubArraysSolution3 {
    /**
     * @param nums: A list of integers
     * @return: An integer denotes the sum of max two non-overlapping subarrays
     */
    public static int maxTwoSubArrays(ArrayList<Integer> nums) {
        // write your code
        int len = nums.size();
        if(len == 2){
            return nums.get(0) + nums.get(1);
        }
        int[] localMax = new int[len];
        int[] globalMax = new int[len];
        localMax[len - 1] = nums.get(len - 1);
        //globalMax[0] = nums.get(0);
        for(int i = len - 2; i>= 0; i--){
            localMax[i] = Math.max(nums.get(i) , localMax[i + 1] + nums.get(i));
            System.out.println(localMax[i]);
        }
        int local = 0;  
        int global = Integer.MIN_VALUE;
        for(int i = 0; i < len ; i++){
            //globalMax[i] = Math.max(globalMax[i - 1] + nums.get(i) , localMax[i - 1]);
            local = Math.max(nums.get(i), local + nums.get(i));  
            global = Math.max(local, global);  
            globalMax[i] = global;
            System.out.println(globalMax[i]);
        }
        int max = Integer.MIN_VALUE;
        for(int i = 1; i < len - 1 ; i++){
            max = localMax[i] + globalMax[i - 1] > max ? localMax[i] + globalMax[i - 1] : max;
        }
        return max;
    }



    
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(5);
        nums.add(-10);
        nums.add(4);
        System.out.println(maxTwoSubArrays(nums));
    }
};
    
 

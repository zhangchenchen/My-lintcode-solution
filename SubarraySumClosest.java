import java.util.*;
public class SubarraySumClosest {
    /**
     * @param nums: A list of integers
     * @return: A list of integers includes the index of the first number 
     *          and the index of the last number
     */
    public static ArrayList<Integer> subarraySumClosest(int[] nums) {
        // write your code here
        int len = nums.length;
        ArrayList<Integer> result = new ArrayList<Integer>();
        int[] sum = new int[len];
        HashMap<Integer,Integer> mapHelper = new HashMap<Integer,Integer>();
        int min = Integer.MAX_VALUE;
        int curr1 = 0;
        int curr2 = 0;
        sum[0] = nums[0];
        for(int i = 1;i < len;i++){
            sum[i] = sum[i-1] + nums[i];
        }
        for(int i = 0;i < len;i++){
            if(mapHelper.containsKey(sum[i])){
                result.add(mapHelper.get(sum[i]));
                result.add(i);
                return result;
            }
            else{
                mapHelper.put(sum[i],i);
            }
        }
        for(int l : sum){
            System.out.println(l);
        }
        Arrays.sort(sum);
        for(int i = 0;i < len-1;i++){
            if(Math.abs(sum[i] - sum[i+1]) < min){
                min = Math.abs(sum[i] - sum[i+1]);
                curr1 = sum[i];
                curr2 = sum[i+1];
            }
        }
        System.out.println(curr1+"dsa"+curr2);
        if(mapHelper.get(curr1) < mapHelper.get(curr2)){
            result.add(mapHelper.get(curr1));
            result.add(mapHelper.get(curr2));
        }
        else{
            result.add(mapHelper.get(curr2));
            result.add(mapHelper.get(curr1)); 
        }
        return result;
    }
        public static void main(String args[]){
        int[] A = {-3,1,1,-3,5};
        //Integer a = new Integer(1);
        
        System.out.println(subarraySumClosest(A));
    }
}


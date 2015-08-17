import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
public class MajorityNumberSolution2 {
    /**
     * @param nums: A list of integers
     * @param k: As described
     * @return: The majority number
     */
    public static int majorityNumber(ArrayList<Integer> nums, int k) {
        // write your code
        ConcurrentHashMap<Integer, Integer> map = new ConcurrentHashMap<Integer,Integer>();
        for(Integer num : nums){
            if(map.size() < k - 1 ){
                if(map.containsKey(num)){
                    map.put(num,map.get(num) + 1);
                }
                else{
                    map.put(num,1);
                }
            }
            else{
                if(map.containsKey(num)){
                    map.put(num,map.get(num) + 1);
                }
                else{
                    for(Integer keyNum : map.keySet()){
                        map.put(keyNum,map.get(keyNum) - 1);
                        if(map.get(keyNum) == 0){
                            map.remove(keyNum);
                        }
                    }
                    if(map.size() < k - 1){
                        map.put(num,1);
                    }
                }
            }
        }
        int max = Integer.MIN_VALUE;
        int res = 0;
        // for(Integer keyNum : map.keySet()){
            // System.out.println(keyNum+ "______________________"+map.get(keyNum));
            // if(map.get(keyNum) > max){
                // res = keyNum;
                // max = map.get(keyNum);
            // }
        // }
        for(Integer keyNum : map.keySet()){
            int count = 0;
            for(Integer num : nums){
                if(keyNum.equals(num)){
                    count++;
                }
            }
            if(count > nums.size()/k){
                res =keyNum; 
            }
        }
        return res;
    }
    
    public static void main(String[] args) {
        int[] n = {32,125,176,234,170,147,151,243,67,62,20,149,191,129,131,107,126,50,194,63,191,191,13,139,191,164,239,119,234,79,51,160,194,140,191,165,80,191,26,26,191,26,16,252,196,12,191,191,249,52,161,169,94,140,250,75,110,143,57,255,90,143,191,71,16,22,50,252,191,138,191,142,221,104,182,57,47,191,179,63,191,68,91,185,225,183,69,216,146,152,164,172,169,68,245,123,191,191,219,207,244,147,215,42,121,112,241,179,27,162,243,133,148,178,214,191,208,138,45,62,191,56,232,74,197,154,225,31,136,191,244,166,41,48,50,94,245,239,103,191,191,161,180,82,210,191,191,253,163,171,140,249,198,51,85,93,55,76,32,191,191,27,57,231,163,205,134,165,40,11,191,133,183,164,138,75,191,22,232,248,54,136,106,109,229,242,121,210,218,28,72,252,90,177,184,60,229,81,98,36,48,21,230,120,19,202,76,196,236,44,162,94,89,151,72,191,242,187,218,228,62,169,62,187,162,232,24,236,164,28,63,117,212,191,206,15,209,85,37,177,23,250,30,126,246,48,115,96,198,106,198,139,19,118,153};
        ArrayList<Integer> nums =  new ArrayList<Integer>();
        nums.add(3);
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(2);
        nums.add(3);
        nums.add(3);
        nums.add(4);nums.add(4);nums.add(4);
        Arrays.sort(n);
        int count = 0;
        for(int i = 0; i< 255; i++){
            if(n[i] == 191){
                count++;
            }
        }
        System.out.println(count);
        System.out.println(n.length);
        //majorityNumber(nums,3);
        //System.out.println(majorityNumber(nums,3));
    }
};
    
 

import java.util.*;
public class MajorityNumberSolution {
    /**
     * @param nums: a list of integers
     * @return: find a  majority number
     */
     //best solution : voting algorithm
     //there is another solution using binary search tree
    public static int majorityNumber(ArrayList<Integer> nums) {
        // write your code
        if(nums == null || nums.size() == 0){
            return -1;
        }
        int majIndex = 0;
        int count = 1;
        for(int i =1 ;i < nums.size() ;i++){
            if(nums.get(i) == nums.get(majIndex)){
                count++;
            }
            else{
                count--;
                if(count == 0){
                   majIndex = i;
                    count = 1;
                }
            }
        }
        System.out.println(nums.get(majIndex));
        //int q = nums.get(majIndex);
        int total = 0;
        //check if majIndex is the index of majority number
        for(int i = 0;i < nums.size();i++){
            if(nums.get(i) == nums.get(majIndex)){
                total++;
            }
        }
        System.out.println(total);
        System.out.println(total + "''''''"+nums.size()+nums.get(0)+nums.get(1)+nums.get(261));
        if(total > nums.size()/2){
            return nums.get(majIndex);
        }
        return -1;
    }
    public static void main(String args[]){

        Integer[] B = {633,10,289,134,491,633,633,196,633,369,742,891,726,633,380,540,472,105,147,144,633,125,38,875,865,633,633,695,492,546,633,337,633,633,540,294,522,633,633,633,737,933,669,172,235,538,841,633,7,633,754,786,4,913,870,633,999,633,386,877,243,633,633,472,364,633,153,633,106,493,633,375,197,633,633,738,934,412,633,633,918,906,633,624,201,977,80,633,87,633,221,399,908,302,71,556,819,793,725,30,459,633,757,404,633,883,633,43,831,733,740,273,633,640,472,49,246,435,633,189,433,633,313,429,633,633,633,239,398,633,639,58,203,633,971,633,472,222,695,417,633,633,633,212,633,886,921,633,633,452,633,633,633,810,923,723,688,162,344,666,235,633,633,609,633,171,633,633,901,509,818,633,100,633,2,161,778,969,633,633,633,239,884,13,848,690,633,633,815,633,633,633,105,445,481,622,633,897,39,460,633,350,633,137,633,326,84,635,468,253,267,633,13,509,802,633,144,531,633,2,907,173,633,222,633,633,503,769,633,633,633,638,938,495,633,293,633,833,633,338,838,563,358,707,562,233,633,354,355,34,980,172,633,583,633,633,633,633,633,679,640,633};
        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(B));
        System.out.println(majorityNumber(A));
    }
}


import java.util.*;
public class Sum3 {
    /**
     * @param numbers : Give an array numbers of n integer
     * @return : Find all unique triplets in the array which gives the sum of zero.
     */
    public static ArrayList<ArrayList<Integer>> threeSum(int[] numbers) {
        // write your code here
        int sum;
        int len = numbers.length;
        
        ArrayList<ArrayList<Integer>> L2 = new ArrayList<ArrayList<Integer>>();
        Arrays.sort(numbers);
        for(int i = 0;i < len;i++){
            int j = i + 1;
            int k = len - 1;
            while(j < k){
                sum = numbers[i] + numbers[j] + numbers[k];
                if(sum == 0){
                    System.out.println("dsadsa");
                    ArrayList<Integer> L1 = new ArrayList<Integer>();
                    L1.add(numbers[i]);
                    L1.add(numbers[j]);
                    L1.add(numbers[k]);
                    
                    if(!L2.contains(L1)){
                        System.out.println(L1);
                        L2.add(L1);
                        System.out.println(L2);
                    }
                    //L1.clear();
                    System.out.println(L2);
                    j++;
                    k--;
                }
                else if(sum > 0){
                    k--;
                }
                else{
                    j++;
                }
            }
        }
        
        return L2;
        
    }
    public static void main(String args[]){
        int[] A = {-1,0,1};
        
        threeSum(A);
    }    
}

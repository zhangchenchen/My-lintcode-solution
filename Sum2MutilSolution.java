import java.util.*;
public class Sum2MutilSolution {

    public static ArrayList<ArrayList<Integer>> twoSum(int[] numbers, int target) {
        //int i = 0;
        int len = numbers.length;
        HashMap<Integer,Integer> mapHelper = new HashMap<Integer,Integer>();
       // ArrayList<Integer> L1= new ArrayList<Integer>();
        ArrayList<ArrayList<Integer>> L2 = new ArrayList<ArrayList<Integer>>();
        for(int i = 0 ;i < len ;i++){
            if(mapHelper.containsKey(numbers[i])){
                int realPos1 = mapHelper.get(numbers[i])+1;
                int realPos2 = i+1;
                ArrayList<Integer> L1= new ArrayList<Integer>();
                L1.add(realPos1);
                L1.add(realPos2);
                L2.add(L1);
            }
            else{
                mapHelper.put(target-numbers[i],i);
            }
        }
        return L2;
    }
    public static void main(String args[]){
        int[] A = {1, 2, 8, 9};
        int target = 10;
        //Integer a = new Integer(1);
        
        System.out.println(twoSum(A,target));
    }
}
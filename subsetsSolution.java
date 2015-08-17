import java.util.*;
class subsetsSolution {
    /**
     * @param S: A set of numbers.
     * @return: A list of lists. All valid subsets.
     */
    public static ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> S) {
        // write your code here
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        Collections.sort(S);
        return helper(res,S,S.size() - 1);
    }
    public static ArrayList<ArrayList<Integer>> helper(ArrayList<ArrayList<Integer>> res, ArrayList<Integer> S , int len){
        if(len == -1){
            ArrayList<Integer> elem = new ArrayList<Integer>();
            res.add(elem);
            return res;
        }
        ArrayList<ArrayList<Integer>> partRes = helper(res, S, len - 1);
        int size = partRes.size();
        for(int i = 0;i < size;i++){
            System.out.println(partRes.size());
            ArrayList<Integer> newPart = new ArrayList<Integer>(partRes.get(i));
            newPart.add(S.get(len));
            res.add(newPart);
        }
        return res;
    }
             public static void main(String[] args) {
                  ArrayList<Integer> S  = new ArrayList<Integer>();
                  S.add(0);
                 // int[] S ={0};
                 subsets(S);
    }
}

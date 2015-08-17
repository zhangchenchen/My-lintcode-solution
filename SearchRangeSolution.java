import java.util.*;
public class SearchRangeSolution {
    /** 
     *@param A : an integer sorted array
     *@param target :  an integer to be inserted
     *return : a list of length 2, [index1, index2]
     */
    public static ArrayList<Integer> searchRange(ArrayList<Integer> A, int target) {
        // write your code here
        int left = 0;
        int right = A.size() - 1;
        ArrayList<Integer> res = new ArrayList<Integer>();
        if(A == null || A.size() == 0){
            res.add(-1);
            res.add(-1);
            return res;
        }
        //A.toArray();
        while(left <= right){
            int mid = (left+right)/2;
            System.out.println(mid);
            if(A.get(mid) == target){
                if(mid >= 1 && A.get(mid-1) == target){
                    res.add(mid-1);
                    res.add(mid);
                }
                if(mid < A.size() - 1 && A.get(mid+1) == target){
                    res.add(mid);
                    res.add(mid+1);
                }
                else{
                    res.add(mid);
                    res.add(mid);
                }
                return res;
            }
            else if(A.get(mid) > target){
                right--;
            }
            else{
                left++;
            }
        }
        res.add(-1);
        res.add(-1);
        return res;
    }
    public static void main(String args[]){
        //int[] A = {-3,1,1,-3,5};
        ArrayList<Integer> A = new ArrayList<Integer>();
        A.add(1);
        //Integer a = new Integer(1);
        
        System.out.println(searchRange(A , 1));
    }
}


import java.util.*;
public class SingleNumberIIISolution {
    /**
     * @param A : An integer array
     * @return : Two integers
     */
    public static List<Integer> singleNumberIII(int[] A) {
        // write your code here
        if(A == null || A.length == 0){
            return null;
        }
        Arrays.sort(A);
        int  i = 1;
        int count = 1;
        List<Integer> listA = new ArrayList<Integer>();
        while(i < A.length){
            System.out.println(i);
            if( A[i] == A[i - 1] && count == 1){
                count++;
                i++;
            }
            else if(A[i] != A[i - 1] && count == 2){
                count = 1;
                i++;
            }
            else if(A[i] != A[i - 1] && count == 1){
                listA.add(A[i - 1]);
                i++;
            }
        }
        if(count == 1){
            listA.add(A[i - 1]);
        }
        return listA;
    }
        public static void main(String args[]){
        int[] A = {5,5,6,7,8,8};
        //ArrayList<Integer> A = new ArrayList<Integer>();
        //A = 
        //Integer a = new Integer(1);
        
        System.out.println(singleNumberIII(A).toString());
    }
}



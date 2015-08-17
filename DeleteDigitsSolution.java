import java.util.*;
public class DeleteDigitsSolution {
    /**
     *@param A: A positive integer which has N digits, A is a string.
     *@param k: Remove k digits.
     *@return: A string
     */
    public static String DeleteDigits(String A, int k) {
        // write your code here
        char[] charA = A.toCharArray();
        ArrayList<Integer> listA = new ArrayList<Integer>();
        for(int i = 0; i < charA.length; i++){
            listA.add(Integer.parseInt(String.valueOf(charA[i])));
        }
        int count = 0;
        int index = 1;
        while(index < listA.size()){
            if(count == k){
                break;
            }
            while(index < listA.size()&&listA.get(index) > listA.get(index-1)){
                index++;
                System.out.println(index);
            }
            if(index == listA.size()){
                for(int m = 0; m < (k - count); m++){
                    listA.remove(listA.size()-1);
                }
            }
            else{
                listA.remove(index-1);
                count++;
                index = index - 1 > 1 ? index - 1 : 1;  
            }
        }
        String res = "";
        for(int i = 0; i < listA.size();i++){
            res = res + listA.get(i);
        }
        return res;
    }
        public static void main(String args[]){
        //int[] A = {-3,1,1,-3,5};
        //ArrayList<Integer> A = new ArrayList<Integer>();
        String A = "87654321";
        int k = 2;
        //Integer a = new Integer(1);
        
        System.out.println(DeleteDigits(A,k));
    }
}



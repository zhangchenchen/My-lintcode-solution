import java.util.Arrays;
public class RemoveElementSolution {
    /** 
     *@param A: A list of integers
     *@param elem: An integer
     *@return: The new length after remove
     */
    public static int removeElement(int[] A, int elem) {
        // write your code here
        int lenTemp = A.length;
        if(A == null || A.length == 0){
            return 0;
        }
        for(int i = 0; i < lenTemp ; ){
            if(A[i] == elem){
                for(int j = i ; j < lenTemp - 1 ; j++){
                    A[j] = A[j+1];
                }
                lenTemp--;
            }
            else{
                i++;
            }
        }
        System.out.println(Arrays.toString(A));
        return lenTemp;
    }
    public static void main(String args[]){
        int[] A = {0,4,4,0,0,2,4,4};
        int elem = 4;
        System.out.println(removeElement(A , elem));
    }
}
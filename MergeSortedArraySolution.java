import java.util.Arrays;
class MergeSortedArraySolution {
    /**
     * @param A: sorted integer array A which has m elements, 
     *           but size of A is m+n
     * @param B: sorted integer array B which has n elements
     * @return: void
     */
    public static void mergeSortedArray(int[] A, int m, int[] B, int n) {
        // write your code here
        int[] S = new int[m + n];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < m && j < n ){

                if(A[i] <= B[j]){
                    S[k] = A[i];
                    i++;
                    k++;
                }
                else{
                    S[k] = B[j];
                    j++;
                    k++;
                }

        }
        System.out.println(k);
        System.out.println(j);
            while (i < m){
                S[k] = A[i];
                i++;
                k++;
            } 
            while (j < n){
                S[k] = B[j];
                j++;
                k++;
            }
        System.out.println(Arrays.toString(S));
        //A = S;
    }
    public static void main(String args[]){
        int[] A = {1, 2, 3};
        int m = A.length;
        int[] B = {4,5};
        int n = B.length;
        mergeSortedArray(A,m,B,n);
    }
}

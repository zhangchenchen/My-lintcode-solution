public class CanJumpSolution {
    /**
     * @param A: A list of integers
     * @return: The boolean answer
     */
    public static boolean canJump(int[] A) {
        // wirte your code here
        int i = 0;
        while(i < A.length){
            if(A[i] == 0){
                return false;
            }
            if(A[i] < A.length - 1 - i){
                i = findMax(A, i);
                System.out.println(i);
            }
            else{
                return true;
            }
        }
        return true;
    }
    private static int findMax(int[] A , int i){
        int j = i;
        int res = i;
        int max = A[i] + i;
        while(j <= i + A[i]){
            if(max <= A[j] + j){
                max = A[j] + j;
                res = j;
            }
            //max = max > (A[j] + j) ? max : (A[j] + j);
            j++;
        }
        return res;
    }
        public static void main(String args[]){
        //int[] A = {-3,1,1,-3,5};
        //ArrayList<Integer> A = new ArrayList<Integer>();
        //Integer a = new Integer(1);
        int[] A ={2,1,0,2,3,2,8,5,7,10,9,9,6,6,3,4,2,9,9,0};
        System.out.println(canJump(A));
    }
}



public class WoodCutSolution {
    /** 
     *@param L: Given n pieces of wood with length L[i]
     *@param k: An integer
     *return: The maximum length of the small pieces.
     */
    public static int woodCut(int[] L, int k) {
        // write your code here
        int max = L[0];
        for(int i = 0;i < L.length;i++){
            max = L[i] > max ? L[i] : max;
        }
        int i = 1;
        int j = max;
        while(i <= j){
            int  len = (j-i)/2+i;
            int  sum = 0;
            for(int m = 0 ;m < L.length ; m++){
                sum+= L[m]/len;
            }
            System.out.println(sum);
            System.out.println(len);
            if(sum == k){
                i = len + 1;
                break;
            }
            else if(sum > k){
                i = len + 1;
            }
            else{
                j = len - 1;
            }
        }
        return i - 1;
    }
       public static void main(String args[]){
        int[] A = {232,124,456};
        int k = 7;
        //Integer a = new Integer(1);
        
        System.out.println(woodCut(A,k));
    }
}



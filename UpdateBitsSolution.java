class UpdateBitsSolution {
    /**
     *@param n, m: Two integer
     *@param i, j: Two bit positions
     *return: An integer
     */
    public static int updateBits(int n, int m, int i, int j) {
        // write your code here
        int mask;
        if(j < 31){
             mask = (~ 0 << (j + 1)) + ~(~ 0 << i);
        }
        else{
             mask = ~ (~ 0 << i);
        }
        n = n & mask;
        n = n ^ (m << i);
        return n;
    }
        public static void main(String args[]){
        //int[] A = {-3,1,1,-3,5};
        //Integer a = new Integer(1);
        int n = 1;
        int m = -1;
        int i = 0 ;
        int j = 31;
        System.out.println(updateBits( n,  m,  i,  j));
    }
}




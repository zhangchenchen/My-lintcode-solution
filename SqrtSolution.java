class SqrtSolution {
    /**
     * @param x: An integer
     * @return: The sqrt of x
     */
    public static int sqrt(int x) {
        // write your code here
        int count = 0;
        if(x == 1){
            return 1;
        }
        while(x > 1){
            x = (int)x/2;
            System.out.print(x+"----");
            count++;
        }
        return count;
    }
    public static void main(String args[]){
        int A = 999999999;
        //Integer a = new Integer(1);
        
        System.out.println(sqrt(A));
    }

}


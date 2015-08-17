public class CountOnesSolution {
    /**
     * @param num: an integer
     * @return: an integer, the number of ones in num
     */
    public static int countOnes(int num) {
        // write your code here
        int count = 0;
        for(int i = 0; i < 32 ; i++){
            System.out.println(1<<i); 
            int temp = num & (1<<i);
            //System.out.println(temp);
            if(temp != 0){
                count++;
/*                 System.out.println(i);
                System.out.println(temp); */

            }
        }
        return count;
    }
    
    
    public static void main(String[] args) {
        int num = 32;
        countOnes(num);
    }
}
 



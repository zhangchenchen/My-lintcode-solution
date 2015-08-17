import java.util.Arrays;
/**Problem: Rotate an array of n elements to the right by k steps. 
For example, with n = 7 and k = 3, 
the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4]. 
How many different ways do you know to solve this problem?**/
//solved  by Zhang Chen
public class RotateArray{
        //方法一：复制到另一个数组中
        public void rotate1(int [] nums, int k){
                int len = nums.length;
                if(k > len){
                    k = k%len;
                }
                int [] result = new int[len];
                for (int i = 0 ; i < k ; i++){
                    result[i] = nums[len - k + i];
                   }
                for (int i = k ; i < len ; i++){
                       result[i] = nums[i - k];
                   }
                System.out.println(Arrays.toString(result));
        }
        //方法二：利用reverse的方法
        public void rotate2(int nums[] ,int k){
                int len = nums.length;
                k = k%len;
                if (nums == null || k < 0){
                    throw new IllegalArgumentException("Illegal Argument");
                }
                reverse (nums , 0 , len-k-1 );
                reverse(nums, len-k, len-1);
                reverse(nums,0,len-1);
                System.out.println(Arrays.toString(nums));
        }
        public void reverse(int [] nums , int beg, int end){
                while(beg < end){
                    int temp = nums[beg];
                    nums[beg] = nums [end];
                    nums[end] = temp;
                    beg++;
                    end--;
                }
        }
        //方法三：Bubbole sort 
        public static void rotate(int[] arr, int order) {
            if (arr == null || order < 0) {
            throw new IllegalArgumentException("Illegal argument!");
        }
 
        for (int i = 0; i < order; i++) {
            for (int j = arr.length - 1; j > 0; j--) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
            }
        }
}
} 
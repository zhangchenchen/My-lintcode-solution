public class RotateArrayTest{
        public static void main(String[] args){
            int [] nums = {1,2,3,4,5,6};
            int k = 3;
            RotateArray test = new RotateArray();
            test.rotate1( nums, k);
            try{
                test.rotate2(nums,k);
            }catch (Exception e){
                System.out.println(e);
            }
        }
} 
import java.util.Arrays;
public class LISProblem{
    /**
    *@author George zhang
    *@date 2015.6.15 0:38
    *传统DP解决LIS（最长递增子序列）问题
    *the code is too ugly 
    **/
    public static void getLISubString(int[] Seq){
        int len = Seq.length;
        int maxLIS = 0;
        int k = 0;
        int[] subLen = new int[len]; // record the LIS end by Seq[i] ,用于记录当前各元素作为最大元素的最长递增序列长度 
        int[] prePos = new int[len]; //record the pre_position 记录当前以该元素作为最大元素的递增序列中该元素的前驱节点，用于打印序列用
        for(int i = 0 ;i < len ;i++ ){
            subLen[i] = 1;
            prePos[i] = i;
        }
        for(int i = 1 ; i < len ;i++){
            //找到以Seq[i]为最末元素的最长递增子序列
            for(int j = 0 ;j < i ; j++){
                if(Seq[j] < Seq[i] && subLen[j] + 1 > subLen[i]){
                    subLen[i] = subLen[j] + 1;
                    prePos[i] = j;
                }
            }
            if(maxLIS < subLen[i]){
                maxLIS = subLen[i];
                k = i;// 记录LIS的最末元素的位置
            }
        }
        //输出LIS
        int[] result = new int[maxLIS];
        int m = maxLIS - 1;
        while( prePos[k] != k){
            result[m--] = Seq[k];
            System.out.println(k);
            k = prePos[k];
        }
        // k = 0 的情况所以要添加上
        result[m] = Seq[k];
        System.out.println(Arrays.toString(result));
    }
    public static void main(String args[]){
        int[] Seq = {3,4,5,3,9,5};
        getLISubString(Seq);
    }
}
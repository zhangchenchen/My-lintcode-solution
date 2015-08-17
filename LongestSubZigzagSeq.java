import java.util.Arrays;
public class LongestSubZigzagSeq {
    /**
    *@author George Zhang
    *@date 2015.6.15 13:26
    *get the length of the longest zigzag sequence 
    **/

    public static void getLSZ(int[] A){
        int len = A.length;
        int maxUp = 0;
        int maxDown = 0;
        int[] up = new int[len];
        int[] down = new int[len];
        for(int i = 0 ; i < len ;i++){
            up[i] = 1;
            down[i] = 1;
        }
        for(int i = 1;i < len;i++ ){
            for(int j = 0;j < i;j++){
                if(A[j] < A[i] && up[i] < down[j] + 1){
                    up[i] = down[j] + 1;
                }
                if(A[j] > A[i] && down[i] < up[j] + 1){
                    down[i] = up[j] + 1;
                }
            }
            maxUp = up[i] > maxUp ? up[i] : maxUp;
            maxDown = down[i] > maxDown ? down[i] : maxDown;
        }
        System.out.println(maxUp > maxDown ? maxUp : maxDown);
    }
    public static void main(String args[]){
        int[] Seq = {1, 17, 5, 10, 13, 15, 10, 5, 16, 8 };
        getLSZ(Seq);
    }
}
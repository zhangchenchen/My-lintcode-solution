import java.util.Arrays;
public class LISProblem{
    /**
    *@author George zhang
    *@date 2015.6.15 0:38
    *��ͳDP���LIS������������У�����
    *the code is too ugly 
    **/
    public static void getLISubString(int[] Seq){
        int len = Seq.length;
        int maxLIS = 0;
        int k = 0;
        int[] subLen = new int[len]; // record the LIS end by Seq[i] ,���ڼ�¼��ǰ��Ԫ����Ϊ���Ԫ�ص���������г��� 
        int[] prePos = new int[len]; //record the pre_position ��¼��ǰ�Ը�Ԫ����Ϊ���Ԫ�صĵ��������и�Ԫ�ص�ǰ���ڵ㣬���ڴ�ӡ������
        for(int i = 0 ;i < len ;i++ ){
            subLen[i] = 1;
            prePos[i] = i;
        }
        for(int i = 1 ; i < len ;i++){
            //�ҵ���Seq[i]Ϊ��ĩԪ�ص������������
            for(int j = 0 ;j < i ; j++){
                if(Seq[j] < Seq[i] && subLen[j] + 1 > subLen[i]){
                    subLen[i] = subLen[j] + 1;
                    prePos[i] = j;
                }
            }
            if(maxLIS < subLen[i]){
                maxLIS = subLen[i];
                k = i;// ��¼LIS����ĩԪ�ص�λ��
            }
        }
        //���LIS
        int[] result = new int[maxLIS];
        int m = maxLIS - 1;
        while( prePos[k] != k){
            result[m--] = Seq[k];
            System.out.println(k);
            k = prePos[k];
        }
        // k = 0 ���������Ҫ�����
        result[m] = Seq[k];
        System.out.println(Arrays.toString(result));
    }
    public static void main(String args[]){
        int[] Seq = {3,4,5,3,9,5};
        getLISubString(Seq);
    }
}
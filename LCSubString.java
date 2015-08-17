import java.util.Arrays;
public class LCSubString{
    /**
    *@author George Zhang
    *@date 2015/6/14 15:13
    *get longest common substring of two string arrays by dynamic programe
    **/
    public static void getLCSubString( String[]A ,String[] B){
        int lenA = A.length ;int lenB = B.length;
        int[][] c = new int[lenA+1][lenB+1];
        int max = -1;
        int currA = -1;
        int currB = -1;
        for(int i = 0;i < lenA+1 ; i++){
            c[i][0] = 0;
        }
        for(int j = 0; j <lenB+1; j++){
            c[0][j] = 0;
        }
        for(int i = 1;i < lenA+1; i++ ){
            for(int j = 1;j<lenB+1;j++){
                if(A[i-1] == B[j-1]){
                    c[i][j] = c[i-1][j-1]+1;

                }
                else{
                    c[i][j] = 0;
                }
                if(c[i][j] > max){
                    max = c[i][j];
                    currA = i-1; // mark the current i and j;
                    currB = j-1;
                }
            } 
        }
        if(max <= 0){
            System.out.println("NO COMMON SUBSTRING!!");
        }
        else{
            String[] C = new String[max];
            int i = currA;
            int j = currB;
            while( i >= 0 && j >= 0){
                if(A[i] == B[j]){
                    C[--max] = A[i];
                    i--;
                    j--;
                }
                else{
                    break;
                }
            }
            System.out.println(Arrays.toString(C));
        }
    }
    public static void main(String[] args){
        String[] A = { "A", "B", "A","H"};  
        String[] B = { "B", "D", "C", "A", "B", "A","H","I","K"};
        getLCSubString(A, B);
    } 
}
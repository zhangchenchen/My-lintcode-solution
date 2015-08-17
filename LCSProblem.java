public class LCSProblem{
    //Get LCS length and mark array b[][];
    public static int[][] getLcsLen( String[]A ,String[] B){
        int lenA = A.length ;int lenB = B.length;
        int[][] c = new int[lenA+1][lenB+1];
        int[][] b = new int[lenA+1][lenB+1];
        for(int i = 0;i < lenA+1 ; i++){
            c[i][0] = 0;
        }
        for(int j = 0; j <lenB+1;j++){
            c[0][j] = 0;
        }
        for(int i = 1;i <lenA+1;i++ ){
            for(int j = 1;j<lenB+1;j++){
                if(A[i-1] == B[j-1]){
                    c[i][j]=c[i-1][j-1]+1;
                    b[i][j]=0;
                }
                else if(c[i-1][j] >= c[i][j-1]){
                    c[i][j]=c[i-1][j];
                    b[i][j]=1;
                }
                else{
                    c[i][j]=c[i][j-1];
                    b[i][j]=-1;
                }
            } 
        }
        return b;
    }
    //backTracking Algorithym by b[][] ,get LCS 
    public static void display( int[][] b , String[] A ,int i , int j){
        if(i==0 || j ==0){
            return ;
        }
        if(b[i][j] ==0){
            //return C.contact( display( int[][] b , String[] A , int i-1 , int j-1));
            display(  b , A , i-1 , j-1);
            System.out.println(A[--i]+"");
        }
        else if(b[i][j] == 1){
            //return C.contact(display(int[][] b,String[] A ,int i-1,int j ));
            display( b, A , i-1, j );
        }
        else if(b[i][j] ==-1){
            //return C.contact(display(int[][] b,String[] A ,int i,int j-1 ));
            display( b, A , i, j-1 );
        }
    }
    
    public static void main(String[] args){
        String[] A = { "A", "B", "C", "B", "D", "A", "B","H","I","K"};  
        String[] B = { "B", "D", "C", "A", "B", "A","H","I"};
        int[][] b = getLcsLen(A, B);  
        display(b, A, A.length, B.length);        
        
    } 

}
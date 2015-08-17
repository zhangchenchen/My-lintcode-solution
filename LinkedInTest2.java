public static int dep (int[] A){
    int P,Q,R;
    int i = 0,j,k;
    int len = A.length;
    int depth = -1;
    while(i < len-2){
        P = A[i];
        j = i+1;
        while(A[j] < A[j-1] && j < len - 1){
            j++;
        }
        if(j > i+1){
            Q = A[j-1];
        }
        else{
            i++;
            continue;
        }
        k = j;
        while(A[k] > A[k-1] && k < len){
            k++;
        }
        if(k > j){
            R = A[k-1];
            depth = Math.max(depth , Math.min(P-Q,R-Q))
            i = k-1;
        }
        else{
            i = j-1;
        }
    }
    return Math.max(depth , -1);
}
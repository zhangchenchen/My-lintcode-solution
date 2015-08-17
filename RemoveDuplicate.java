public class RemoveDuplicate {
    /**
     * @param A: a array of integers
     * @return : return an integer
     */
public static int removeDuplicates(int[] A) {
    if(A==null || A.length==0)
        return 0;
    int idx = 0;
    int count = 0;
    for(int i=0;i<A.length;i++)
    {
        if(i>0 && A[i]==A[i-1])
        {
            count++;
            if(count>=3)
                continue;
        }
        else
        {
            count = 1;
        }
        A[idx++]=A[i];
    }
    for(int m : A){
       System.out.println(m); 
    }
    return idx;
}
        public static void main(String args[]){
        int[] A = {-14,-14,-14,-14,-14};
        System.out.println(removeDuplicates(A));
    }
}

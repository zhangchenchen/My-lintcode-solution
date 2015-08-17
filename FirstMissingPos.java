public class FirstMissingPos {

    public static int firstMissingPositive(int[] A) {
        int i = 0;
        int len = A.length;
        int temp;
        while(i < len){
            System.out.println("adsa");
            if(A[i] != i+1){
                System.out.println("adsa");
                if(A[i] <= 0 || A[i] > len || A[i] == A[A[i] - 1]){
                    i++;
                    continue;
                }
                else{
                    temp = A[i];
                    A[i] = A[temp - 1];
                    A[temp - 1] = temp;
                }
            }
            else{
                i++;
            }
        }
        for(int j = 0 ; j < len ;j++){
            System.out.println("adsa");
            if(A[j] != j+1){
                return j+1;
            }
        }
        return len+1;
    }
    public static void main(String args[]){
        int[] A = {1};
        System.out.println(firstMissingPositive(A));
    }
}
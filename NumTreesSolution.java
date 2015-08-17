public class PowSolution {
    /**
     * @paramn n: An integer
     * @return: An integer
     */
public static double power(double x, int n) {
	if (n == 0)
		return 1;
 
	double v = power(x, n / 2);
 
	if (n % 2 == 0) {
		return v * v;
	} else if(n % 2 == 1){
		return v * v * x;
	}else{
        return v * v * (1/x);
    }
}
 
public static double pow(double x, int n) {
		return power(x, n);

}
    public static void main(String args[]){
        //int[] A = {-3,1,1,-3,5};
        //Integer a = new Integer(1);
        int n = -3;
        double x = 1.0
        
        System.out.println(pow( x,  n));
    }
}


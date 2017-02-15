/**
 * @author Varun
 * LeetCode: Implement pow(x,n)
 */
public class Pow {

	public double myPow(double x, int n) {
		double temp;
		if(n == 0)
			return 1;
		temp = myPow(x , n/2);
		if(n%2 == 0)
			return temp*temp;
		else
			return x*temp*temp;
	}
	
	public static void main(String[] args) {
		Pow p = new Pow();
		double result = p.myPow(2,3);
		System.out.println(result);
	}
}

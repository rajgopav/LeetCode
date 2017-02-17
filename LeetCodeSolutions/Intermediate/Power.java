/**
 * @author Varun
 *
 */
public class Power {
	
	public double myPow(double x, int n) {
		double result = 1;
		
		while(n > 0) {
			if(n%2 != 0) {
				result = result * x;
			}
			
			x = x * x;
			n = n/2;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		Power p = new Power();
		double result = p.myPow(2, 3);
		System.out.println(result);

	}

}

/**
 * @author Varun
 * Reverse digits of an integer.
 * Example1: x = 123, return 321
 * Example2: x = -123, return -321
 */
public class ReverseInteger {
	
	public void reverseInteger(int x) {
		int rev = 0;
	    while(x != 0){
	        rev = rev*10 + x%10;
	        x = x/10;
	    }
	    System.out.println(rev);
	}
	
	public static void main(String args[]) {
		ReverseInteger ri = new ReverseInteger();
		ri.reverseInteger(-123);
	}
}

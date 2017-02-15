/**
 * @author Varun
 * LeetCode: Palindrome Number
 * Determine whether an Integer is a Palindrome. Do this without extra space
 *
 */
public class PalindromNumber {
	
	public boolean isPalindrome(int x) {
		//Negative numbers are not Palindromes
		if(x < 0)
			return false;
		
		// Initialize how many zeroes
		int div = 1;
		while(x / div >= 10) {
			div *= 10;
		}
		
		while(x != 0) {
			int left = x / div;
			int right = x % 10;
			
			if(left != right) {
				return false;
			}
			
			x = (x % div) / 10;
			div /= 100;
		}
		return true;
	}
	
	public static void main(String[] args) {
		PalindromNumber pn = new PalindromNumber();
		boolean result = pn.isPalindrome(121);
		System.out.println(result);
	}
}

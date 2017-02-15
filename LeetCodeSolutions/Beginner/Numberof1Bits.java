/**
 * @author Varun
 * LeetCode : Write a function that takes an unsigned integer and returns the number of ’1' bits it has (also known as the Hamming weight).
 * For example, the 32-bit integer ’11' has binary representation 00000000000000000000000000001011, so the function should return 3.
 */

public class Numberof1Bits {
	
	public void hammmingWeight(int n){
		
		int result[] = new int[n];
		for(int i = 0; i < 6; i++) {
			result[i] = Integer.bitCount(i);
		}
		
		for(int i : result)
			System.out.print(i + ",");
	}	
}

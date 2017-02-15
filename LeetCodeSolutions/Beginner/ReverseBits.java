/**
 * @author Varun
 * LeetCode: Reverse bits of a given 32 bits unsigned integer.
 * For example, given input 43261596 (represented in binary as 00000010100101000001111010011100), 
 *   return 964176192 (represented in binary as 00111001011110000010100101000000).
 */
public class ReverseBits {
	public void reverseBits(int num) {
		int count;
		count = Integer.reverse(43261596);
		System.out.println(count);
	}
}

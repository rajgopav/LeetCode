/**
 * @author varun
 * LeetCode : Given a non negative integer number num. 
 * For every numbers i in the range 0 ≤ i ≤ num calculate the number of 1's in their binary representation and 
 * return them as an array.
 *
 * Example:
 * For num = 5 you should return [0,1,1,2,1,2].
 */
public class CountingBits {

	public int[] countBits(int num) {
		int result[] = new int[num+1];
		for(int i = 0; i <=num; i++) {
			result[i] = countEach(i);
		}
		
		return result;
	}
	
	private int countEach(int num) {
		int result = 0;
		while(num !=0) {
			if(num%2 == 1) result++;
			
			num = num/2;
		}
		return result;
	}
}

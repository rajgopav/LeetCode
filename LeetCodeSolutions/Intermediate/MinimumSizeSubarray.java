/**
 * @author Varun
 * @category
 * LeetCode : Medium
 * Given an array of n positive integers and a positive integer s, 
 * find the minimal length of a subarray of which the sum ≥ s. If there isn't one, return 0 instead.
 * 
 * For example, given the array [2,3,1,2,4,3] and s = 7, 
 * the subarray [4,3] has the minimal length of 2 under the problem constraint.
 *
 */
public class MinimumSizeSubarray {
	
	public int minSubArrayLen(int s, int[] nums) {
		if(nums == null || nums.length == 0) 
			return 0;
		
		int i = 0;
		int j = 0;
		int sum = 0;
		int minLen = Integer.MAX_VALUE;
		
		while(j < nums.length) {
			if(sum < s) { 
				sum += nums[j];
				j++;
			} else {
				minLen = Math.min(minLen, j-i);
				
				if(i == j-1)
					return 1;
				
				sum -= nums[i];
				i++;
			}
		}
		
		while(sum >= s) {
			minLen = Math.min(minLen, j-i);
			sum -= nums[i];
			i++;
		}
		
		return minLen==Integer.MAX_VALUE? 0 : minLen;
	}
}

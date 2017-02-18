/**
 * @author Varun
 * LeetCode: Given an array of n integers where n > 1, nums, 
 * return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].
 * Solve it without division and in O(n).
 * For example, given [1,2,3,4], return [24,12,8,6].
 */
public class ProductOfArrayExceptSelf {
	
	public int[] productExceptSelf(int[] nums) {
		int result[] = new int[nums.length];
		
		int t1[] = new int[nums.length];
		int t2[] = new int[nums.length];
		
		t1[0] = 1;
		t2[nums.length-1] = 1;
		
		for(int i=0; i < nums.length-1; i++) {
			t1[i+1] = t1[i] * nums[i];
		}
		
		for(int i=nums.length-1; i > 0; i--) {
			t2[i-1] = t2[i] * nums[i];
		}
		
		for(int i=0; i < nums.length; i++) {
			result[i] = t1[i] * t2[i];
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		ProductOfArrayExceptSelf ps = new ProductOfArrayExceptSelf();
		int array[] = {1,2,3,4};
		int result[] = ps.productExceptSelf(array);
		for(int i : result) {
			System.out.print(i + " ");
		}

	}

}

/**
 * @author Varun
 * LeetCode : Easy
 * Given a sorted array and a target value, return the index if the target is found. 
 * If not, return the index where it would be if it were inserted in order.
 * You may assume no duplicates in the array.
 * 
 * Here are few examples.
 * [1,3,5,6], 5 → 2
 * [1,3,5,6], 2 → 1
 * [1,3,5,6], 7 → 4
 * [1,3,5,6], 0 → 0
 * 
 */
public class SearchInsertPosition {

	public static int searchInsert(int[] nums, int target) {
		int i = 0;
		int j = nums.length - 1;

		while(i <= j) {
			int mid = (i + j) / 2;

			if(target > nums[mid]) {
				i = mid + 1;
			} else if (target < nums[mid]){
				j = mid - 1;
			} else {
				return mid;
			}
		}
		return i;
	}

	public static void main(String args[]) {
		int[] arr = {1,3,5,6};
		int position = searchInsert(arr, 5);
		System.out.println(position);
	}
}

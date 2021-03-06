/**
 * @author Varun
 * LeetCode Easy: 
 * Rotate an array of n elements to the right by k steps.
 * For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
 */
public class RotateArray {
	public static void rotate(int arr[], int order) {
		if(arr == null || arr.length == 0) {
			return;
		}
		
		if(order > arr.length) {
			order = order % arr.length;
		}
		
		int a = arr.length - order;
		
		reverse(arr, 0, a-1);
		reverse(arr, a, arr.length - 1);
		reverse(arr, 0, arr.length - 1);
	}
	
	public static void reverse(int arr[], int left, int right) {
		while(left < right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
		rotate(arr, 3);
		for(int i : arr) {
			System.out.print(i + " ");
		}
	}
}

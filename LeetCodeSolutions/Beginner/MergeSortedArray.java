
public class MergeSortedArray {
	
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		if(nums1 == null || nums2 == null || n == 0)
			return;
		
		int i = m - 1;
		int j = n - 1;
		int k = m + n - 1;
		
		while(i >= 0 && j >= 0) {
			if(nums1[i] > nums2[j]) {
				nums1[k--] = nums1[i--];
			} else {
				nums1[k--] = nums2[j--];
			}
		}
		
		while(j >= 0) {
			nums1[k--] = nums1[j--];
		}
	} 
	
	public static void main(String[] args) {
		int[] nums1 = {1, 3, 5, 7, 9, 0 , 0 , 0 , 0 , 0};
		int[] nums2 = {2, 4, 6, 8, 10};
		merge(nums1, 5, nums2, 5);
		for(int i : nums1) {
			System.out.print(i + " ");
		}
	}
}

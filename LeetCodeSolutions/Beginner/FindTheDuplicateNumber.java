
public class FindTheDuplicateNumber {

	public static void main(String[] args) {
		int nums[] = {1,2,3,2,4,5,6};
		FindTheDuplicateNumber fd = new FindTheDuplicateNumber();
		int result = fd.findDuplicate(nums);
		System.out.print(result);
	}

	public int findDuplicate(int[] nums) {
		int slow = 0;
	    int fast = 0;
	 
	    do{
	        slow = nums[slow];
	        fast = nums[nums[fast]];
	    } while(slow != fast);
	 
	    int find = 0;
	 
	    while(find != slow){
	        slow = nums[slow];
	        find = nums[find];
	    }
	    return find;
	}
}

import java.util.ArrayList;
import java.util.List;

/**
 * @author Varun
 *	LeetCode : Given a set of distinct integers, nums, return all possible subsets.
 *	Note: The solution set must not contain duplicate subsets.
 *	For example,
 *	If nums = [1,2,3], a solution is:
 *  [
 *  	[3],
 *		[1],
 *	 	[2],
 *		[1,2,3],
 *		[1,3],
 *		[2,3],
 *		[1,2],
 *		[]
 *	]
 */

public class Subsets {

	public static List<List<Integer>> subsets(int[] nums) {
		if(nums == null)
			return null;
		
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		result.add(new ArrayList<Integer>());
		
		for(int i=0; i<nums.length; i++) {
			int len = result.size();
			for(int j=0; j<len; j++ ) {
				List<Integer> temp = new ArrayList<Integer>(result.get(j));
				temp.add(nums[i]);
				result.add(temp);
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		int[] arr ={1,2,3};
		List<List<Integer>> result = subsets(arr);
		for (List<Integer> list : result) {
			list.forEach(i->System.out.print(i+" "));
			System.out.println();
		}
	}
}

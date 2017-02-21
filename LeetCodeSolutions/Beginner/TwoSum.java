import java.util.HashMap;

/**
 * @author Varun
 *LeetCode : Given an array of integers, find two numbers such that they add up to a specific target number.
 * For example:
 * Input: numbers={2, 7, 11, 15}, target=9
 * Output: index1=0, index2=1
 * 	
 */
public class TwoSum {
	
	public static int[] twoSum(int[] numbers, int target) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int[] result = new int[2];
		
		for(int i=numbers.length-1; i >=0; i--) {
			if(map.containsKey(numbers[i])) {
				int index = map.get(numbers[i]);
				result[0] = index;
				result[1] = i;
			} else {
				map.put(target - numbers[i], i);
			}
		}
		return result;	
	}
	
	public static void main(String[] args) {
		int[] numbers = {2, 7, 11, 15};
		int[] result = twoSum(numbers, 9);
		for(int i : result) {
			System.out.println(i + " ");
		}
	}
}

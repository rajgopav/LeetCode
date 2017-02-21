import java.util.HashMap;


/**
 * @author Varun
 * LeetCode : Design and implement a TwoSum class. It should support the following operations: add and find. 
 * add - Add the number to an internal data structure.
 * find - Find if there exists any pair of numbers which sum is equal to the value.
 *  
 * For example,
 * add(1); 
 * add(3); 
 * add(5);
 * find(4) -> true
 * find(7) -> false
 */
public class TwoSum3 {
	private static HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	
	public static void add(int number) {
		if(map.containsKey(number)) {
			map.put(number, map.get(number) + 1);
		} else {
			map.put(number, 1);
		}
	}
	
	public static boolean find(int number) {
		for(Integer i : map.keySet()) {
			int target = number - i;
			if(map.containsKey(target)) {
				if(i == target && map.get(target) < 2)
					continue;
				
				return true;
			}
		}
		return false;
	}
}

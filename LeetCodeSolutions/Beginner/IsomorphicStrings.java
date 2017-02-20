import java.util.LinkedHashMap;

/**
 * @author Varun
 * LeetCode : Given two strings s and t, determine if they are isomorphic.
 * Two strings are isomorphic if the characters in s can be replaced to get t.
 * All occurrences of a character must be replaced with another character while preserving the order of characters.
 * No two characters may map to the same character but a character may map to itself.
 * 
 * For example,
 * Given "egg", "add", return true.
 * Given "foo", "bar", return false.
 * Given "paper", "title", return true.
 *
 */
public class IsomorphicStrings {
	
	public static boolean isomorphicStrings(String s, String t) {
		if(s == null || t == null) {
			return false;
		}
		
		if(s.length() != t.length())
			return false;
		
		LinkedHashMap<Character, Character> map = new LinkedHashMap<Character, Character>();
		for(int i=0; i < s.length(); i++) {
			char s1 = s.charAt(i);
			char t1 = t.charAt(i);
			
			if(map.containsKey(s1)) {
				if(map.get(s1) != t1){
					return false;
				}
			} else {
				if(map.containsValue(t1))
					return false;
				
				map.put(s1,t1);
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		String s = "egg";
		String t = "add";
		boolean result = isomorphicStrings(s, t);
		System.out.println(result);
	}
}

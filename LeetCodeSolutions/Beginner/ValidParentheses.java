import java.util.*;

/**
 * @author Varun
 * 
 * @category
 * LeetCode: Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 */
public class ValidParentheses {
	
	public boolean isValid(String s) {
		if(s == null || s.length() == 0)
			return false;
		
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		map.put('(', ')');
		map.put('{', '}');
		map.put('[', ']');
		
		Stack<Character> stack = new Stack<Character>();
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			
			if(map.keySet().contains(ch)) {
				stack.push(ch);
			} else if(map.values().contains(ch)) {
				if(!stack.isEmpty() && (stack.peek() == ch))
					stack.pop();
				else
					return false;
			}
		}
		return stack.isEmpty();
	}
}

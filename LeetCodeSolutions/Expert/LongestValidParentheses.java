import java.util.*;

/**
 * @author Varun
 * @category
 * LeetCode : Hard
 * Given a string containing just the characters '(' and ')', find the length of the longest valid (well-formed) parentheses substring.
 * For "(()", the longest valid parentheses substring is "()", which has length = 2.
 * Another example is ")()())", where the longest valid parentheses substring is "()()", which has length = 4.
 */
public class LongestValidParentheses {
	
	public static int longestValidParentheses(String s) {
		if(s == null || s.length() == 0)
			return 0;
		
		int validLength = 0;
		int openParenthesesCount = 0;
		int maxValidLength = 0;
		
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			
			if(ch == '(') {
				openParenthesesCount++;
			} else {
				if(openParenthesesCount > 0 ) {
					openParenthesesCount--;
					validLength += 2;
				} else {
					validLength = 0;
					openParenthesesCount = 0;
				}
			}
			
			if(maxValidLength < validLength) {
				maxValidLength = validLength;
			}
		}
		
		return maxValidLength;
	}
	
	public static void main(String[] args) {
		String s = ")()())";
		int count = longestValidParentheses(s);
		System.out.print(count);
	}
}

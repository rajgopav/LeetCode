/**
 * @author Varun
 * LeetCode: Given an input string, reverse the string word by word. A word is defined as a sequence of non-space characters.
 * The input string does not contain leading or trailing spaces and the words are always separated by a single space.
 * For example,
 * Given s = "the sky is blue",
 * return "blue is sky the".
 */
public class ReverseWords2 {
	
	public static void reverseWords(char[] s) {
		int start = 0;
		for(int i = 0; i < s.length; i++) {
			if(s[i] == ' ') {
				reverse(s, start, i - 1);
				start = i + 1;
			}
		}
		reverse(s, start, s.length-1);
	}
	
	private static void reverse(char[] s, int left, int right) {
		while(left < right) {
			char temp = s[left];
			s[left] = s[right];
			s[right] = temp;
			left++;
			right--;
		}
	}
	
	public static void main(String[] args) {
		char[] arr = {'t','h','i','s',' ','i','s',' ', 'a',' ','s','t','r','i','n','g'};
		reverseWords(arr);
		System.out.println(arr);
	}
}

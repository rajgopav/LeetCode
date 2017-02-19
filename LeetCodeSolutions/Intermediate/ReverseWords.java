/**
 * @author Varun
 * LeetCode: Given an input string, reverse the string word by word.
 * For example, given s = "the sky is blue", return "blue is sky the".
 */
public class ReverseWords {
	
	public static String reverseWords(String words) {
		if(words == null || words.length() == 0) {
			return "";
		}
		
		String[] arr = words.split(" ");
		StringBuilder sb = new StringBuilder();
		for(int i = arr.length - 1; i >=0 ;i--) {
			if(!arr[i].equals(" ")){
				sb.append(arr[i]).append(" ");
			}
		}
		return sb.length() == 0 ? " " : sb.substring(0, sb.length() - 1);
	}
	
	public static void main(String[] args) {
		String str = "the sky is blue";
		String str1 = reverseWords(str);
		System.out.println(str1);
	}
}

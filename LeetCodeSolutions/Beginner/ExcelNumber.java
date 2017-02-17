/**
 * @author Varun
 * LeetCode : Given a column title as appear in an Excel sheet, return its corresponding column number.
 * For example:
 *  A -> 1
 *  B -> 2
 *  C -> 3
 *  ...
 *  Z -> 26
 *  AA -> 27
 *  AB -> 28 
 */
public class ExcelNumber {
	
	public int titleToNumber(String s) {
		if(s == null || s.length() == 0)
			return 0;
		
		int result = 0;
		int i = s.length()-1;
		int t = 0;
		while(i >= 0) {
			char ch = s.charAt(i);
			result = result + (int) Math.pow(26, t) * (ch-'A'+1);
			t++;
			i--;
		}
		return result;
	}
	
	public static void main(String[] args) {
		ExcelNumber en = new ExcelNumber();
		int result = en.titleToNumber("AB");
		System.out.println(result);
	}

}

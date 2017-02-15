
public class Numberof1Bits {

	public static void main(String[] args) {
	
		int result[] = new int[6];
		for(int i = 0; i < 6; i++) {
			result[i] = Integer.bitCount(i);
		}
		for(int i : result)
			System.out.print(i + ",");
		
		System.out.println();
		int count;
		count = Integer.reverse(43261596);
		System.out.println(count);
		
		int x = 123;
		int rev = 0;
	    while(x != 0){
	        rev = rev*10 + x%10;
	        x = x/10;
	    }
	    System.out.println(rev);
	    
	    int a = 1, b =2;
	    while(b!=0) {
	    	int c = a&b;
	    	a ^= b;
	    	b = c << 1;
	    }
	    System.out.println(a);
	}
}

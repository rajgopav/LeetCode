
public class MissingNumber {

	public static void main(String[] args) {
		int num[] = {0,1,3};
		int miss = 0;
		for(int i=0; i < num.length; i++ ) {
			miss ^= (i+1) ^ num[i];
		}
		System.out.print(miss);
	}
}

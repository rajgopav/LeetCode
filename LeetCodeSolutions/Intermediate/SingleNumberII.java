
public class SingleNumberII {

	public static void main(String[] args) {
		int arr[] = {1,1,1,2,2,2,3,4,4,4};
		int result = singleNumber(arr);
		System.out.println(result);

	}
	
	public static int singleNumber(int arr[]) {
		int ones = 0, twos = 0, threes = 0;
		for(int i = 0; i < arr.length; i++) {
			twos |= ones & arr[i];
			ones ^= arr[i];
			threes = ones & twos;
			ones &= ~threes;
			twos &= ~threes;
		}
		return ones;
	}
}

/**
 * @author Varun
 *	LeetCode: Count the number of prime numbers less than a non-negative number, n.
 */
public class CountPrimes {
	
	public int countPrimes(int n) {
		boolean isPrime[] = new boolean[n];
		for(int i=2; i<n; i++) {
			isPrime[i] = true;
		}
		
		for(int i=2; i*i<n; i++) {
			if(!isPrime[i]) continue;
			for(int j=i*i; j<n; j +=i){
				isPrime[j] = false;
			}
		}
		
		int count=0;
		for(int i=2; i<n; i++)
			if(isPrime[i]) count++;
		
		return count;
	}
	
	public static void main(String[] args) {
		CountPrimes cp = new CountPrimes();
		int result = cp.countPrimes(10);
		System.out.println(result);
	}
}
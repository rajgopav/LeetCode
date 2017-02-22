import java.util.*;

public class TeslaChallenge {

	public static void main(String[] args) {
		int A[] = {40, 40, 100, 80, 20};
		int B[] = {3, 3, 2, 2, 3};
		int X = 3;
		int Y = 200;
		
		int stops = solution1(A, B, 5, X, Y);
		System.out.println(stops);
	}

	public static int solution1(int[] A, int[] B, int M, int X, int Y) {
		int totalStops = 0;
		int totalWeight = 0;
		int maxPersons = 0;
		Set<Integer> floors = new HashSet<Integer>();	
		
		for(int i = 0; i < A.length; i++) {
			if(maxPersons + 1 > X || totalWeight + A[i] > Y) {
				totalStops += floors.size()+1;
				floors.clear();
				totalWeight = 0;
				maxPersons = 0;
			}
			
			floors.add(B[i]);
			maxPersons++;
			totalWeight += A[i];
		}
		if(floors.size() > 0)
			totalStops += floors.size()+1;
			
		return totalStops;
	}
}

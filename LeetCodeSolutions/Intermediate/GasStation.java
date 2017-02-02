
public class GasStation {
	
	public int gasStation(int gas[], int cost[]) {
		if(gas == null || gas.length == 0 || cost == null || cost.length == 0)
			return -1;
		
		int sum=0;
		int total=0;
		int startIndex=0;
		
		for(int i=0; i<gas.length; i++) {
			sum += (gas[i]-cost[i]);
			total += (gas[i]-cost[i]);
			
			if(sum < 0){
				sum = 0;
				startIndex = i+1;
			}
		}
		
		return total >=0 ? startIndex%gas.length : -1;
	}
	
	public static void main(String[] args) {
		GasStation gs = new GasStation();
		int gas[] = {1,2,3,4,5};
		int cost[] = {1,3,2,4,5};
		
		int result = gs.gasStation(gas, cost);
		System.out.print(result);
	}
}

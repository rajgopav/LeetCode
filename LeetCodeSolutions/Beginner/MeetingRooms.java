import java.util.Arrays;

public class MeetingRooms {
	
	
	public static void main(String[] args) {
		Intervals one = new Intervals(0,4);
		Intervals two = new Intervals(5,10);
		Intervals three = new Intervals(15,20);
		
		Intervals array[] = new Intervals[3];
		array[0] = one;
		array[1] = two;
		array[2] = three;
		
		boolean result = canAttendMeetings(array);
		System.out.print(result);
		
	}

	public static boolean canAttendMeetings(Intervals inter[]) {
		Arrays.sort(inter, (Intervals a, Intervals b) -> a.getStartTime() - b.getStartTime());

		for(int i = 0; i < inter.length-1; i++) {
			if(inter[i].endTime > inter[i+1].startTime) {
				return false;
			}
		}

		return true;
	}
}

class Intervals {
	int startTime;
	int endTime;
	
	public int getStartTime() {
		return startTime;
	}

	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}

	public int getEndTime() {
		return endTime;
	}

	public void setEndTime(int endTime) {
		this.endTime = endTime;
	}

	public Intervals(int start, int end) {
		this.startTime = start;
		this.endTime = end;
	}
}

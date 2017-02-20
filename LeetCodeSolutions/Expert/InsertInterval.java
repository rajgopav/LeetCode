import java.util.ArrayList;

/**
 * @author Varun
 * LeetCode : Given a set of non-overlapping & sorted intervals, insert a new interval into the intervals (merge if necessary).
 * Example 1:
 * Given intervals [1,3],[6,9], insert and merge [2,5] in as [1,5],[6,9].
 * 
 * Example 2:
 * Given [1,2],[3,5],[6,7],[8,10],[12,16], insert and merge [4,9] in as [1,2],[3,10],[12,16].
 * This is because the new interval [4,9] overlaps with [3,5],[6,7],[8,10].
 */
public class InsertInterval {
	
	public static ArrayList<Interval1> insert(ArrayList<Interval1> intervals, Interval1 newInterval) {
		ArrayList<Interval1> result = new ArrayList<Interval1>();
		
		for(Interval1 interval : intervals) {
			if(interval.end < newInterval.start) {
				result.add(interval);
			} else if(interval.start > newInterval.end) {
				result.add(newInterval);
				newInterval = interval;
			} else if(interval.end >= newInterval.start || interval.start <= newInterval.end) {
				newInterval = new Interval1(Math.min(interval.start, newInterval.start), Math.max(interval.end, newInterval.end));
			}
		}
		result.add(newInterval);
		return result;
	}
	
	public static void main(String[] args) {
		Interval1 i1 = new Interval1(1,2);
		Interval1 i2 = new Interval1(3,5);
		Interval1 i3 = new Interval1(6,7);
		Interval1 i4 = new Interval1(8,10);
		Interval1 i5 = new Interval1(12,16);
		Interval1 i6 = new Interval1(4,9);
		
		ArrayList <Interval1> intervals = new ArrayList<Interval1>();
		intervals.add(i1);
		intervals.add(i2);
		intervals.add(i3);
		intervals.add(i4);
		intervals.add(i5);
		intervals = insert(intervals, i6);
		intervals.forEach(s -> System.out.println(s.start + "," +s.end));
	}
}

class Interval1 {
	int start;
	int end;
	
	public Interval1(int start, int end) {
		this.start = start;
		this.end = end;
	}
	
	@Override
	public String toString() {
		return "[" + start + "," + end + "]";
	}
}
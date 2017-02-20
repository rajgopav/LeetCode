import java.util.*;

/**
 * @author Varun
 * LeetCode : Given a collection of intervals, merge all overlapping intervals.
 * For example,
 * Given [1,3],[2,6],[8,10],[15,18],
 * return [1,6],[8,10],[15,18].
 *
 */
public class MergeIntervals {
	
	public static List<Interval> merge(List<Interval> intervals) {
		List<Interval> result = new ArrayList<Interval>();
		
		if(intervals == null || intervals.size() == 0) {
			return result;
		}
		
		Collections.sort(intervals, new Comparator<Interval>() {
			public int compare(Interval I1, Interval I2) {
				if(I1.start != I2.start) {
					return I1.start - I2.start;
				} else {
					return I1.end - I2.end;
				}
			}
		});
		
		Interval pre = intervals.get(0);
		for(int i = 0; i < intervals.size(); i++) {
			Interval curr = intervals.get(i);
			if(curr.start>pre.end) {
				result.add(pre);
				pre = curr;
			} else {
				Interval merged = new Interval(pre.start, Math.max(pre.end, curr.end));
				pre = merged;
			}
		}
		result.add(pre);
		return result;
	}
}

class Interval {
	int start;
	int end;
	
	public Interval(int start, int end) {
		this.start = start;
		this.end = end;
	}
}
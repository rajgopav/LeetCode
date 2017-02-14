import java.util.Collections;
import java.util.PriorityQueue;

public class FindMedianDataStream {
	
	PriorityQueue<Integer> maxHeap;
	PriorityQueue<Integer> minHeap;
	
	public FindMedianDataStream() {
		maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
		minHeap = new PriorityQueue<Integer>();
	}
	
	public void addNum(int num) {
		maxHeap.offer(num);
		minHeap.offer(maxHeap.poll());
		
		if(maxHeap.size() < minHeap.size()) {
			maxHeap.offer(minHeap.poll());
		}
	}
	
	public double getMedian() {
		if(maxHeap.size() == minHeap.size()) {
			return (double) (maxHeap.peek() + minHeap.peek()) / 2;
		} else {
			return maxHeap.peek();
		}
	}
}

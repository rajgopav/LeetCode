import java.util.*;

public class MergeKSortedLists {
	
	public static NodeMerge mergekSortedLists(NodeMerge lists[]) {
		if(lists == null || lists.length == 0) {
			return null;
		}
		
		PriorityQueue<NodeMerge> queue = new PriorityQueue<NodeMerge>( new Comparator<NodeMerge>() {
			public int compare(NodeMerge l1, NodeMerge l2) {
				return l1.data - l2.data;
			}
		});
		
		NodeMerge head = new NodeMerge(0);
		NodeMerge p = head;
		
		for(NodeMerge node : lists) {
			if(node != null)
				queue.add(node);
		}
		
		while(!queue.isEmpty()) {
			NodeMerge node = queue.poll();
			p.next = node;
			p = p.next;
			
			if(node.next != null) {
				queue.offer(node.next);
			}
		}
		
		return head.next;
	}
}

class NodeMerge{
	int data;
	NodeMerge next;
	
	public NodeMerge(int data) {
		this.data = data;
		this.next = null;
	}
}

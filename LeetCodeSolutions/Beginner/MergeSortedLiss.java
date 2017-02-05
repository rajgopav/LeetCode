
public class MergeSortedLiss {
	
	public static ListNode2 mergeLists(ListNode2 l1, ListNode2 l2) {
		ListNode2 head = new ListNode2(0);
		ListNode2 p = head;
		
		ListNode2 p1 = l1;
		ListNode2 p2 = l2;
		while(p1 != null && p2 != null) {
				if(p1.val < p2.val) {
					p.next = p1;
					p1 = p1.next;
				} else {
					p.next = p2;
					p2 = p2.next;
				}
				p = p.next;
		} 
		 
		if(p1 != null ) {
			p.next = p1;
		} 
		
		if(p2 != null) {
			p.next = p2;
		}
		
		return head.next;
	}
}

class ListNode2 {
	int val;
	ListNode2 next;
	
	public ListNode2(int data) {
		this.val = data;
		this.next = null;
	}
}
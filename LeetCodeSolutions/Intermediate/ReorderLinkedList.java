
public class ReorderLinkedList {

	public static void main(String[] args) {
		ListNode1 n1 = new ListNode1(1);
		ListNode1 n2 = new ListNode1(2);
		ListNode1 n3 = new ListNode1(3);
		ListNode1 n4 = new ListNode1(4);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		printList(n1);
		reOrderList(n1);
		printList(n1);
	}
	
	public static void reOrderList(ListNode1 head) {
		if(head != null && head.next != null) {
			ListNode1 slow = head;
			ListNode1 fast = head;
			
			while(fast != null && fast.next != null && fast.next.next != null) {
				slow = slow.next;
				fast = fast.next.next;
			}
			
			ListNode1 second = slow.next;
			slow.next = null;
			
			second = reverseList(second);
			
			ListNode1 p1 = head;
			ListNode1 p2 = second;
			
			while(p2 != null) {
				ListNode1 temp1 = p1.next;
				ListNode1 temp2 = p2.next;
				
				p1.next = p2;
				p2.next = temp1;
				
				p1 = temp1;
				p2 = temp2;
			}
		}
	}
	
	private static ListNode1 reverseList(ListNode1 head) {
		if(head == null || head.next == null)
			return head;
		
		ListNode1 pre = head;
		ListNode1 curr = head.next;
		
		while(curr != null) {
			ListNode1 temp = curr.next;
			curr.next = pre;
			pre = curr;
			curr = temp;
		}
		
		head.next = null;
		return pre;
	}
	
	public static void printList(ListNode1 n) {
		while (n != null) {
			System.out.print(n.val + " ");
			n = n.next;
		}
		System.out.println();
	}
}

class ListNode1 {
	int val;
	ListNode1 next;
	
	public ListNode1(int data) {
		this.val = data;
		this.next = null;
	}
}

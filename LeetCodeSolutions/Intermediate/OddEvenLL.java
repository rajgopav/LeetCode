
public class OddEvenLL {

	public static void main(String[] args) {
		ListNode3 l1 = new ListNode3(1);
		ListNode3 l2 = new ListNode3(2);
		ListNode3 l3 = new ListNode3(3);
		ListNode3 l4 = new ListNode3(4);
		ListNode3 l5 = new ListNode3(5);

		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		//display(l1);
		
		l1 = oddEvenLL(l1);
		display(l1);
	}
	
	public static ListNode3 oddEvenLL(ListNode3 head) {
		
		if(head == null)
			return head;
		
		ListNode3 p1 = head;
		ListNode3 p2 = head.next;
		ListNode3 connectNode = head.next;
		
		while(p1 != null && p2 != null) {
			ListNode3 t = p2.next;
			if(t == null)
				break;
			
			p1.next = p2.next;
			p1 = p1.next;
			
			p2.next = p1.next;
			p2 = p2.next;	
		}
		p1.next = connectNode;
		
		return head;
	}
	
	public static void display(ListNode3 head) {
		ListNode3 curr = head;
		while(curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
	}
}

class ListNode3 {
	int data;
	ListNode3 next;
	
	public ListNode3(int data) {
		this.data = data;
		this.next = null;
	}
}
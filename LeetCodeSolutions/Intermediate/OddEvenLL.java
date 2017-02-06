
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
		
		//l1 = oddEvenLL(l1);
		
		ListNode3 l6 = new ListNode3(6);
		ListNode3 l7 = new ListNode3(7);
		
		l6.next = l7;
		l7.next = l4;
		
		ListNode3 result = intersectionLL(l1, l6);
		System.out.println(result.data);
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
	
	public static ListNode3 intersectionLL(ListNode3 headA, ListNode3 headB) {
		int len1 = 0;
		int len2 = 0;
		ListNode3 p1 = headA, p2 = headB;
		
		if(p1 == null || p2 == null)
			return null;
		
		while(p1 != null) {
			len1++;
			p1 = p1.next;
		}
		
		while(p2 != null) {
			len2++;
			p2 = p2.next;
		}
		
		int diff = 0;
		p1 = headA; p2 = headB;
		
		if(len1 > len2) {
			diff = len1 - len2;
			int i = 0;
			while(i < diff) {
				p1 = p1.next;
				i++;
			}
		} else if(len1 < len2) {
			diff = len2 - len1;
			int i = 0;
			while(i < diff) {
				p2 = p2.next;
				i++;
			}
		}
		
		while(p1 != null && p2 != null) {
			if(p1.data == p2.data) {
				return p1;
			} 
				p1 = p1.next;
				p2 = p2.next;
		}
		
		return null;
	}
	
	public static void display(ListNode3 head) {
		ListNode3 curr = head;
		while(curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
	}
	
	public static ListNode3 removeElements(ListNode3 head, int value) {
		ListNode3 helper = new ListNode3(0);
		helper.next = head;
		ListNode3 current = helper;
		
		while(current.next != null) {
			if(current.next.data == value) {
				current.next = current.next.next;
			} else {
				current = current.next;
			}
		}
		return helper.next;
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
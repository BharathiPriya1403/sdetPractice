package linkedList;

public class DoublyLinkedList extends LinkedListImpl {


	public DoublyLinkedList(ListNode root) {
		super(root);
	}

	public static ListNode create(int[] ar) {
		ListNode root = new ListNode(ar[0]);
		ListNode prev = root;
		
		int i = 1 ;
		while(i<ar.length) {
			ListNode nm = new ListNode(ar[i]);
			ListNode temp = prev;
			temp.next = nm;
			nm.prev = prev;
			prev = prev.next;
			i++;
			
		}
			
		return root;
		
	}
	
	public void removeFirst() {
		head = head.next;
		head.prev = null;
	}

}

package linkedList;

public class SingleLinkedList extends LinkedListImpl {
	
	public SingleLinkedList(ListNode root) {
		super(root);
	}

	public static ListNode create(int[] ar) {
		if (ar.length == 0)
			return null;
		ListNode root = new ListNode(ar[0]);
		ListNode temp = root;
		for (int i = 1; i < ar.length; i++) {
			ListNode nm = new ListNode(ar[i]);
			temp.next = nm;
			temp = temp.next;
		}

		return root;
	}
	
	public void removeFirst() {
		head = head.next;
	}

}

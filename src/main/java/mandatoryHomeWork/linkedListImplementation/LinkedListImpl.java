package linkedListImplementation;

public abstract class LinkedListImpl implements ILinkedList {

	ListNode head;

	public LinkedListImpl(ListNode root) {
		this.head = root;
	}

	@Override
	public int getElement(int index) {
		int size = 0;
		ListNode temp = head;
		while (temp != null) {
			if (size == index)
				return temp.val;
			size++;
			temp = temp.next;
		}

		return -1;
	}

	@Override
	public int indexOf(int element) {
		int size = 0;
		ListNode temp = head;
		while (temp != null) {
			if (temp.val == element)
				return size;
			size++;
			temp = temp.next;
		}

		return -1;
	}

	@Override
	public int lastIndexOf(int element) {
		int size = 0;
		int last = -1;
		ListNode temp = head;
		while (temp != null) {
			if (temp.val == element) {
				last = size;
			}
			size++;
			temp = temp.next;
		}

		return last;
	}

	@Override
	public ListNode addAll(ListNode list, int index) {
		ListNode temp = this.head;
		int size = 0;

		while (temp != null && size + 1 < index) {
			temp = temp.next;
			size++;
		}

		ListNode nm = temp.next;
		temp.next = list;

		while (temp.next != null)
			temp = temp.next;
		temp.next = nm;
		return this.head;
	}

	@Override
	public abstract void removeFirst();

	@Override
	public void removeLast() {
		ListNode temp = head;

		while (temp.next.next != null) {
			temp = temp.next;
		}

		temp.next = null;

	}
}

package linkedListImplementation;

import org.testng.annotations.Test;

public class CheckImplementationDLL {

	@Test
	public void getElement() {
		int[] arr = {1,2, 3, 4, 5};
		ListNode h = DoublyLinkedList.create(arr);
		DoublyLinkedList dLL = new DoublyLinkedList(h);
		System.out.println(dLL.getElement(2));
		System.out.println("---------------");
	}
	
	@Test
	public void indexOf() {
		int[] arr = {1,2, 3, 4, 5};
		ListNode h = DoublyLinkedList.create(arr);
		DoublyLinkedList dLL = new DoublyLinkedList(h);
		System.out.println(dLL.indexOf(2));
		System.out.println("---------------------");
	}
	
	@Test
	public void lastIndexOf() {
		int[] arr = {1,2, 3, 4, 5};
		ListNode h = DoublyLinkedList.create(arr);
		DoublyLinkedList dLL = new DoublyLinkedList(h);
		System.out.println(dLL.lastIndexOf(5));
		System.out.println("---------------------");
	}
	
	@Test
	public void addAll() {
		int[] arr = {1,2, 3, 4, 5};
		int[] arr1 = {1,5};
		ListNode h = DoublyLinkedList.create(arr);
		ListNode h1 = DoublyLinkedList.create(arr1);

		DoublyLinkedList dLL = new DoublyLinkedList(h);
		
		ListNode n1 = dLL.addAll(h1, 2);
		while(n1!=null) {
			System.out.println(n1.val);
			n1=n1.next;
		}
		System.out.println("---------------------");
	}
	
	@Test
	public void removeFirst() {
		int[] arr = {1,2, 3, 4, 5};
		ListNode h = DoublyLinkedList.create(arr);
		DoublyLinkedList dLL = new DoublyLinkedList(h);
		dLL.removeFirst();
		ListNode n1 = dLL.head;
		while(n1!=null) {
			System.out.println(n1.val);
			n1=n1.next;
		}
		System.out.println("---------------------");
	}
	
	@Test
	public void removeLast() {
		int[] arr = {1,2, 3, 4, 5};
		ListNode h = DoublyLinkedList.create(arr);
		DoublyLinkedList dLL = new DoublyLinkedList(h);
		dLL.removeLast();
		ListNode n1 = dLL.head;
		while(n1!=null) {
			System.out.println(n1.val);
			n1=n1.next;
		}
		System.out.println("---------------------");
	}
	
	
	
}

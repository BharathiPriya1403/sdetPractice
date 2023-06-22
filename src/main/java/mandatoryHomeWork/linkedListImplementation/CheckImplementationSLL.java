package linkedListImplementation;

import org.testng.annotations.Test;

public class CheckImplementationSLL {
	
	@Test
	public void getElement() {
		int[] arr = {1,2, 3, 4, 5};
		ListNode h = SingleLinkedList.create(arr);
		SingleLinkedList sLL = new SingleLinkedList(h);
		System.out.println(sLL.getElement(2));
		System.out.println("---------------------");
	}
	
	@Test
	public void indexOf() {
		int[] arr = {1,2, 3, 4, 5};
		ListNode h = SingleLinkedList.create(arr);
		SingleLinkedList sLL = new SingleLinkedList(h);
		System.out.println(sLL.indexOf(2));
		System.out.println("---------------------");
	}
	
	@Test
	public void lastIndexOf() {
		int[] arr = {1,2, 3, 4, 5};
		ListNode h = SingleLinkedList.create(arr);
		SingleLinkedList sLL = new SingleLinkedList(h);
		System.out.println(sLL.lastIndexOf(5));
		System.out.println("---------------------");
	}
	
	@Test
	public void addAll() {
		int[] arr = {1,2, 3, 4, 5};
		int[] arr1 = {1,5};
		ListNode h = SingleLinkedList.create(arr);
		ListNode h1 = SingleLinkedList.create(arr1);

		SingleLinkedList sLL = new SingleLinkedList(h);
		
		ListNode n1 = sLL.addAll(h1, 3);
		while(n1!=null) {
			System.out.println(n1.val);
			n1=n1.next;
		}
		System.out.println("---------------------");
	}
	
	@Test
	public void removeFirst() {
		int[] arr = {1,2, 3, 4, 5};
		ListNode h = SingleLinkedList.create(arr);
		SingleLinkedList sLL = new SingleLinkedList(h);
		sLL.removeFirst();
		ListNode n1 = sLL.head;
		while(n1!=null) {
			System.out.println(n1.val);
			n1=n1.next;
		}
		System.out.println("---------------------");
	}
	
	@Test
	public void removeLast() {
		int[] arr = {1,2, 3, 4, 5};
		ListNode h = SingleLinkedList.create(arr);
		SingleLinkedList sLL = new SingleLinkedList(h);
		sLL.removeLast();
		ListNode n1 = sLL.head;
		while(n1!=null) {
			System.out.println(n1.val);
			n1=n1.next;
		}
		System.out.println("---------------------");
	}
	
}

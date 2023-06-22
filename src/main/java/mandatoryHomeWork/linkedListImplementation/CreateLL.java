package linkedListImplementation;

import org.testng.annotations.Test;

public class CreateLL {
	
	@Test
	public void TC1() {
		int n = 10;
		ListNode h = solveCreate(n);
		
		while(h != null) {
			System.out.println(h.val);
			h = h.next;
		}
		
	}
	
	@Test
	public void TC2() {
		int n = -1;
		ListNode h = solveCreate(n);
		
		while(h != null) {
			System.out.println(h.val);
			h = h.next;
		}
		
	}
	
	@Test
	public void TC3() {
		int n = 0;
		ListNode h = solveCreate(n);
		
		while(h != null) {
			System.out.println(h.val);
			h = h.next;
		}
		
	}
	
	public ListNode solveCreate(int n ) {
		
		ListNode h = new ListNode(1);
		ListNode temp = h;
		
		int i = 2 ;
		while(i<=n) {
			ListNode nm = new ListNode(i);
			temp.next = nm ;
			temp = nm;
			i++;
		}
			
		return h;
		
	}

}


package linkedList;

import org.testng.annotations.Test;

public class RemoveDuplicate {
	
	/**
	 * https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/
	 * 
	 * TC-O(n)
	 * sc - O(n)
	 * 
	 */
	
	@Test
	public void TC1() {
		int[] arr = {1,1,1,2};
		ListNode h = SingleLinkedList.create(arr);
		ListNode ans = deleteDuplicates(h);
		
		while(ans!=null) {
			System.out.println(ans.val);
			ans = ans.next;		
		}

	
	}
	
	 public ListNode deleteDuplicates(ListNode head) {
		 
		  if(head==null) return null;
		  
	        ListNode current = head.next;
	        ListNode prev = head;

	        while(current!=null){
	            if(current.val == prev.val){
	            	prev.next = current.next;
	            }else {
	            	prev = current;
	            }
	            current = current.next;
	        }
			return head;
	    }

}

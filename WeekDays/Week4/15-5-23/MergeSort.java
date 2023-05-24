package linkedList;

import org.testng.annotations.Test;

public class MergeSort {
	
	
	@Test
	public void TC1() {
		int[] ar = {1,3,5};
		int[] ar1 = {2, 4, 8};
		ListNode node1 = SingleLinkedList.create(ar);
		ListNode node2 = SingleLinkedList.create(ar1);
		ListNode n = mergeTwoLists(node1,node2);
		
		while(n != null) {
			System.out.println(n.val);
			n = n.next;
		}
	}
	
       public ListNode mergeTwoLists(ListNode list1,ListNode list2) {
    	   
    	   ListNode h1 = null ; 
    	   ListNode h2 = null;

    	   if(list1.val<=list2.val) {
    		   h1 = list1;
    		   h2 = list2;
    		   	   
    	   }else {
    		   h2 = list1;
    		   h1 = list2;
    	   }

    	   
    	   ListNode prev = null;
    	   ListNode head = h1;
    	   
    	   while(h1!=null && h2 != null) {
    		   if(h1.val<=h2.val) {
    			   prev = h1;
    			   h1 = h1.next;
    		   }else {
    			   prev.next = h2;
    			   ListNode temp = h2;
    			   h2 = h2.next;
    			   temp.next = h1;
    			   prev = temp;
    		   }
    	   }

    	   if(h1== null) {
    		   prev.next=h2;
    	   }
    	   if(h2==null) {
    		   prev.next = h1;
    	   }
    	   
		return head;
        
    }

}

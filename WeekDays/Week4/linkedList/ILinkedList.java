package linkedList;

public interface ILinkedList {
	
	public int getElement(int index) ;
	
	public int indexOf(int element);
	
	public int lastIndexOf(int element);
	
	public ListNode addAll(ListNode list, int index);
	
	public void removeFirst();
	
	public void removeLast();
		
}

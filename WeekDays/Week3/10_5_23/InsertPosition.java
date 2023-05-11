package dailyProb;
import org.testng.annotations.Test;

public class InsertPosition {
	
	/**
	 * https://leetcode.com/problems/search-insert-position/description/
	 * 
	 * TC - O(logn)
	 * SC - O(1)
	 * 
	 */
	
	@Test
	public void TC1() {
		int[] nums = {1};
		int target = 1;
		System.out.println(searchInsert(nums,target));
	}
	
	
	 public int searchInsert(int[] nums, int target) {
	        
	        int left = 0 ;
	        int right = nums.length-1;
	      
	       while(left<=right){
	            int mid = (left+right)/2;
	           if(nums[mid]==target){
	               return mid;
	           }else if(nums[mid]<target){
	               left = mid+1;
	           }else right = mid-1;
	       }
	       
		return nums[left] > target ? left : left+1;
	       
	      
	        
	    }

}

package mandatoryHomeWork.week2.day3;
import org.testng.annotations.Test;

public class LC_1464_MaximumProductOfTwoElementsInAnArray {
	
	/**
	 * https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/
	 * 
	 * TC - O(n^2)
	 * SC - O(1)
	 * 
	 */

	
	@Test
	public void TC1() {
		int[] nums = {1,5,4,5};
		System.out.println(maxProduct(nums));
	}
	
	 public int maxProduct(int[] nums) {
	        
	        int max = Integer.MIN_VALUE ;
	        for(int i = 0 ;i<nums.length;i++){
	          for(int j = i+1;j<nums.length;j++){
	              int temp = (nums[i]-1)*(nums[j]-1);
	              max = Math.max(max,temp);
	          }
	        }
	        return max;
	    }
	 
	 
}

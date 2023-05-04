import java.util.Arrays;

import org.testng.annotations.Test;

public class distinct {
	
	/**
	 * https://leetcode.com/problems/third-maximum-number/description/
	 * 
	 * Pseudo Code:
	 * Sort the Array 
	 * 1st max will be - value of nums.length-1
	 * iterate the array from last and update the max value which is number less than first max 
	 * return the max value when count ==2;
	 * 
	 * To handle array less than 3 juz return the last value of nums.
	 * 
	 * 
	 * TC - O(nlogn)
	 * SC - O(1)
	 * 
	 */

	@Test
	public void TC1() {
		int[] arr = { 5,2,2}; 
	    System.out.println(thirdMax(arr));
	}
	


		 public int thirdMax(int[] nums) {
		        Arrays.sort(nums);
		        int max = nums[nums.length-1];
		        int count = 0 ;
		        for(int i = nums.length-1;i>=0;i--){
		            if(nums[i]<max){
		                max = nums[i];
		                count++;
		            }

		            if(count == 2){
		                return max;
		            }
		        }

		        return nums[nums.length-1];
		    }

	
	}


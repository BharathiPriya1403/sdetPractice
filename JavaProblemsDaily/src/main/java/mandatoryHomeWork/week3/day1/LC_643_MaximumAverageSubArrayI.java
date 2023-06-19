package mandatoryHomeWork.week3.day1;

import org.testng.annotations.Test;

public class LC_643_MaximumAverageSubArrayI {
	
	/*
	 * https://leetcode.com/problems/maximum-average-subarray-i/
	 * 
	 * TC - O(n)
	 * SC - (1)
	 * 
     * sliding window approach
     * 
     * converting the ans to double at the end saves runtime.
	 * 
	 */
	
	@Test
	public void TC1() {
		 int[] nums = {1,12,-5,-6,50,3}; 
		 int k = 4;
		 findMaxAverage(nums,k);
	}
	
	
//	 public double findMaxAverage(int[] nums, int k) {
//	        
//	        int left = 0 ;
//	        double ans = 0 ;
//	        double sum = 0 ;
//
//	        for(int i = 0 ; i<nums.length;i++){
//	             ans+=nums[i];
//	             if((i-left+1) == k){
//	                 double temp = ans;
//	                 sum = Math.max(sum,ans/k);
//	                 ans = temp-nums[left++];
//	             }
//	        }
//
//	        return ans;
//	    }
	
	 public double findMaxAverage(int[] nums, int k) {
	        
	        int left = 0 ;
	        int ans = 0 ;
	        int sum = Integer.MIN_VALUE ;

	        for(int i = 0 ; i<nums.length;i++){
	             ans+=nums[i];
	             if((i-left+1) == k){
	                 int temp = ans;
	                 sum = Math.max(sum,ans);
	                 ans = temp-nums[left++];
	             }
	        }

	        return (double)sum/k;

	    }

}

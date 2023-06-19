package mandatoryHomeWork.week2.day3;

import java.util.Arrays;

import org.testng.annotations.Test;

public class SingleNumber {
	/**
	 * https://leetcode.com/problems/single-number/
	 * 
	 * BruteForce:
	 * 2for loops - outer forloops for i and inner forloop for which starts from 0 as well 
	 * When i and j is equal , increase the count variable
	 * since there will be only one unique num the count will 1 
	 * if count is == 1 return 1.
	 * 
	 * TC - O(n^2)
	 * SC - O(1)
	 *
	 *optimised solution
	 *XOR the ans 
	 * TC - O(n)
	 *SC - O(1)
	 */
	
	
	@Test
	public void TC1() {
		int[]nums = {4,1,2,1,2};
		System.out.println(singleNumber(nums));
	}
	
	
// 	public int singleNumber(int[] nums) {
// 	      for(int i = 0 ; i < nums.length ; i++){
// 	          int count = 0 ;
// 	          for(int j = 0 ; j<nums.length; j++){
// 	              if(nums[i]==nums[j] ){
// 	                   count++;
// 	              }
// 	          }

// 	          if(count == 1)
// 	          return nums[i];
// 	      }
// 	      return 0;
// 	    }
	
    public int singleNumber(int[] nums) {
    int ans = 0;
    for(int i = 0; i < nums.length; i++){
        ans ^= nums[i];
        }
        return ans;
    }
	
}

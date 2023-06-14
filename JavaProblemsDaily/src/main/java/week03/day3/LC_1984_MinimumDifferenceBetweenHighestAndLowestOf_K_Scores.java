package week03.day3;

import java.util.Arrays;

import org.testng.annotations.Test;

public class LC_1984_MinimumDifferenceBetweenHighestAndLowestOf_K_Scores {
	
	/**
	 * https://leetcode.com/problems/minimum-difference-between-highest-and-lowest-of-k-scores/description/
	 * 
	 * TC- O(nlogn)
	 * SC- O(1)
	 * 
	 */
	
	@Test
	public void TC1() {
		
		int[] nums = {9,4,1,7};
		int k = 2;
		System.out.println(slidesort(nums,k));
	}
	
	
	public int slidesort(int[] nums , int k) {
		
		Arrays.sort(nums);
        int left = 0 ;
        int ans = 100000 ;

        for(int i = 0 ; i<nums.length;i++){
             if((i-left+1) == k){
                 int diff = nums[i]-nums[left++];
                 ans=Math.min(ans, diff);
             }
        }

        return ans;

    }

}

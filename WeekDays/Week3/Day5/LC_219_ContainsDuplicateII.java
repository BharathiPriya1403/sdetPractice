package dailyProb;

import java.util.HashMap;

import org.testng.annotations.Test;

public class LC_219_ContainsDuplicateII {
	
	
	@Test
	public void TC1() {
		int[]nums = {1,2,3,1};
		int k = 3;
		System.out.println(containsNearbyDuplicate(nums,k));
	}
	
	
	@Test
	public void TC2() {
		int[]nums = {1,2};
		int k = 2;
		System.out.println(containsNearbyDuplicate(nums,k));
	}
	
	
	
	
	 public boolean containsNearbyDuplicate(int[] nums, int k) {

	        // for(int i = 0 ; i<nums.length-1; i++){
	        //     for(int j = i+1;j<nums.length;j++){
	        //         if(nums[i]==nums[j] && Math.abs(i-j)<=k){
	        //             return true;
	        //         }
	        //     }
	        // }
	        // return false;

	        HashMap<Integer,Integer> hm = new HashMap<>();

	        if(nums.length<=1){
	            return false;
	        }

	        int ans = 0 ;
	        for(int i = 0 ;i<nums.length;i++){

	            if(hm.containsKey(nums[i])){
	                ans = Math.abs(hm.get(nums[i])-i);           
	            }
	            hm.put(nums[i],i);
	        }
	       return ans<=k? true:false;
	    }

}

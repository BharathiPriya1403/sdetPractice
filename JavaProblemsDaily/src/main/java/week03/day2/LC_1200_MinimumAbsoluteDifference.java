package week03.day2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

public class LC_1200_MinimumAbsoluteDifference {
	
	/**
	 * https://leetcode.com/problems/minimum-absolute-difference/description/
	 * 
	 * TC - O(nlogn)
	 * SC - 0(1)
	 * 
	 * sort the array
	 * Find the minimum diff using for or while loop and save the minimum in ans
	 * another loop if 1st and second element diff is == ans add to List 
	 * then add the temp list to output list 
	 * 
	 * 
	 * 
	 */
	
	
	@Test
	public void TC1() {
		int[] arr = {4,2,1,3};
		minimumAbsDifference(arr);
	}
	
	@Test
	public void TC2() {
		int[] arr = {1,3,6,10,15};
		minimumAbsDifference(arr);
	}
	
	


	 public List<List<Integer>> minimumAbsDifference(int[] arr) {

	        List<List<Integer>> out = new ArrayList<>();
	        int i = 0 ;
	        int ans = Integer.MAX_VALUE ;
	        Arrays.sort(arr);
	        while(i<arr.length-1){
	            int temp = (arr[i+1]-arr[i]);
	            ans = Math.min(ans,temp);
	            i++;
	        }

	        i = 0;

	        while(i<arr.length-1){
	            if(ans ==  (arr[i+1]-arr[i])){
	               List<Integer> temp = new ArrayList<>();
	               temp.add(arr[i]);
	                temp.add(arr[i+1]);
	                out.add(temp);
	            }
	            i++;
	        }

	        return out;

	    }
}

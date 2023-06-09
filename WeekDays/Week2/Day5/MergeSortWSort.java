package leetCode;

import java.util.Arrays;

public class MergeSortWSort {
	
	/**
	 * https://leetcode.com/problems/merge-sorted-array/
	 * 
	 * TC - O(m*n)
	 * SC - O(n)
	 * 
	 */
	
	public void TC1() {
		int[] nums1 = {1,2,3,0,0,0}; 
		int m = 3;
		int[] nums2 = {2,5,6};
		int n = 3;
		merge(nums1,m,nums2,n);
	}
	
	public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[m+n];
       
       int i = 0;
       int j = m ;
       while(i<m && j<temp.length){
        temp[i] = nums1[i];
        temp[j] = nums2[i];
        i++;
        j++;
       }
      
    
     for(int k = 0 ; k<temp.length;k++){    
        nums1[k] = temp[k];
      }      
        Arrays.sort(nums1);
   }

}

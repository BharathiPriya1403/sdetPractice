package mandatoryHomeWork.week4.day1;

import java.util.Arrays;

import org.testng.annotations.Test;

public class LC_21_MergeTwoSortedList {
	
	@Test
	public void TC1() {
		int[] nums1 = {1,2,3};
		int[] nums2 = {2,5,6};
	    System.out.println(Arrays.toString( merge(nums1,nums2)));
	}
	
	
	public int[] merge(int[] nums1, int[] nums2) {
        int[] temp = new int[nums1.length+nums2.length];
        
        int left = 0;
        int right = 0 ;
        int k = 0 ;
        while(left<nums1.length && right<nums2.length){
        	if(nums1[left]<nums2[right]) temp[k++] = nums1[left++];
        	else temp[k++] = nums2[right++];       
        }
        while(left < nums1.length) temp[k++] = nums1[left++];
        
        while(right < nums2.length) temp[k++] = nums2[right++];
        
		return temp;
       
   }

}

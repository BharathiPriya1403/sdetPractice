package leetCode;

public class LC_2540_MinimumCommonValue {
	
	public void TC1() {
		int[] nums1 = {1,2,3};
		int[] nums2 = {2,4};
		getCommon(nums1,nums2);
	}
	
	
	 public int getCommon(int[] nums1, int[] nums2) {
	        int n = nums1.length;
	        int m = nums2.length;

	       int i = 0 ;
	       int j = 0 ;
	        while(i<n && j<m){
	            if(nums1[i]<nums2[j]){
	                i++;
	            }else if(nums1[i]==nums2[j])
	            {
	                return nums1[i];
	            }else
	            j++;
	        }


	        return -1;
	    }

}

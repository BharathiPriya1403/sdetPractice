package week02.day4;
import java.util.Arrays;

import org.testng.annotations.Test;

public class LC_905_SortArrayBrParity {

	@Test
	public void TC1() {
		int[] nums = { 1, 5, 4, 5 };
		System.out.println(Arrays.toString(sortArrayByParity(nums)));
	}

//	public int[] sortArrayByParity(int[] nums) {
//        int[] output = new int[nums.length];
//       
//        int k = 0 ;
//
//      for(int i = 0 ; i<nums.length;i++){
//            if(nums[i]%2==0){
//                output[k] = nums[i];
//                k++;
//            }
//           
//        }
//      
//      for(int i = 0 ; i<nums.length;i++){
//          if(nums[i]%2!=0){
//              output[k] = nums[i];
//              k++;
//
//          }
//      }
//        return output;
//    }

	public int[] sortArrayByParity(int[] nums) {
		int[] output = new int[nums.length];

		int i = 0;
		int j = nums.length - 1;
		for(int k = 0 ; k<nums.length;k++) {
			if(nums[k]%2==0) {
				output[i] = nums[k];
				i++;
			}else {
				output[j] = nums[k];
				j--;
			}
		}
		return output;
	}

}

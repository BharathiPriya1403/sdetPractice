package week03.day5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.testng.annotations.Test;

public class LC_169_MajorityElement {
	
	
	@Test
	public void TC1() {
		int[] nums = {3,2,1,1,1,1,2};
		System.out.println(majElement(nums));
	}
	
	
	public int majElement(int[] arr) {
        			
//		for (int i = 0; i < arr.length; i++) {
//			int count = 0 ;
//			for (int j = i+1; j < arr.length; j++) {
//				if(arr[i]==arr[j]) {
//					count ++;
//				}			
//			}
//			
//			if(count>=arr.length/2) {
//				return arr[i];
//			}
//			
//		}
//		return 0;
//			
//	}
		
//		Arrays.sort(arr);
//		return arr[arr.length/2];
		
		int prev = arr[0];
		int ans  = arr[0];
		int count = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if(count == 0 ) {
				ans = arr[i];
				count++;
			}else if (ans == arr[i]) {
				count++;
			}else count --;
			
		}
		return ans ;
	}

}

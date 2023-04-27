package arrays;

import java.util.Arrays;

import org.testng.annotations.Test;

public class PlusOne {
	
	@Test
	public void TC1() {
		int[] n = {-2};
         System.out.println(Arrays.toString(addOne(n)));
	}
	
	@Test
	public void TC2() {
		int[] n = {0};
         System.out.println(Arrays.toString(addOne(n)));
	}
	
	@Test
	public void TC3() {
		int[] n = {4,9,9};
         System.out.println(Arrays.toString(addOne(n)));
	}
	
	@Test
	public void TC4() {
		int[] n = {9,9,9};
         System.out.println(Arrays.toString(addOne(n)));
	}
	
	@Test
	public void TC5() {
		int[] n = {4,3,2,1};
         System.out.println(Arrays.toString(addOne(n)));
	}
	

	public int[] addOne(int[] digits) {
		
		int[] arr;
		int count = 0 ;
		for(int i = 0 ; i<digits.length;i++) {
			if(digits[i] == 9) count++;
		}
		
		if(count == digits.length) {
			arr = new int[digits.length+1];
		}else {
			arr = new int[digits.length];
		}
		
		int carry = 1;
		for(int i = digits.length-1; i>=0; i--) {
			int sum = digits[i]+carry;
			
			arr[i] = sum%10;
			carry = sum/10;			
		}
		
		if(carry>0) {
			arr[0] = carry;
		}
		return arr;
	}

}

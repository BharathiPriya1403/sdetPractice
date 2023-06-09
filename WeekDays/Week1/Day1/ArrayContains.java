package arrays;

import org.testng.annotations.Test;

public class ArrayContains {
	
	@Test
	public void TC1() {
		int[] arr = {-2 , 1 ,2 ,5};
		int num = 9;
        System.out.println(checkNumber(arr, num));
	}
	
	@Test
	public void TC2() {
		int[] arr = {-2 , 1 ,2 ,5};
		int num = 1;
        System.out.println(checkNumber(arr, num));
	}
	
	@Test
	public void TC3() {
		int[] arr = {};
		int num = 1;
        System.out.println(checkNumber(arr, num));
	}

	public boolean checkNumber(int[] arr , int num) {
		
		for(int i = 0 ; i<arr.length;i++) {
			if(arr[i]==num) {
				return true;
			}
		}
		return false;
		
	}

}

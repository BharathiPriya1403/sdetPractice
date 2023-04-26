package arrays;

import java.util.Arrays;

import org.testng.annotations.Test;

public class TrimLength {
	
	@Test
	public void TC1() {
		int[] arr = {-2 , 1 ,2 ,5};
		int num = -1;
        System.out.println(Arrays.toString(Tlen(arr, num)));
	}
	
	@Test
	public void TC2() {
		int[] arr = {-2 , 1 ,2 ,5};
		int num = 0;
        System.out.println(Arrays.toString(Tlen(arr, num)));
	}
	
	@Test
	public void TC3() {
		int[] arr = {-2 , 1 ,2 ,5};
		int num = 3;
        System.out.println(Arrays.toString(Tlen(arr, num)));
	}
	
	public int[] Tlen(int[] arr, int num) {
		
		if(num<0) {
			return null;
		}
		
		int[] arr1 = new int[num];
		
		for(int i = 0 ; i<num;i++) {
			arr1[i] = arr[i];
		}
		return arr1;
		
	}
}

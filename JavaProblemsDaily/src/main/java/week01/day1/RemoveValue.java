package week01.day1;

import java.util.Arrays;

import org.testng.annotations.Test;

public class RemoveValue {
	
	@Test
	public void TC1() {
		int[] arr = {-2 , 1 ,2 ,5};
		int num = 9;
        System.out.println(Arrays.toString(DeleteValue(arr, num)));
	}

	private int[] DeleteValue(int[] arr, int num) {
		
		int[] arr1;	
		
		int count = 0 ;
		for(int j = 0 ; j<arr.length;j++) {
			if(arr[j] == num) {
				count++;
			}
		}
		
		if(count !=0) {
			arr1 = new int[arr.length-1];
		}else
			arr1 = new int[arr.length];
			
		
		int save = -1;
		for(int i = 0 ; i<arr.length;i++) {
			if(arr[i]==num) {
				save = i;
				break;
			}
			arr1[i] = arr[i];
		}
		
		if(save!=-1) {
			for(int i = save; i<arr1.length;i++) {
				arr1[i] = arr[i+1];
			}
		}else return arr;
		
	
		return arr1;
		
	}

}

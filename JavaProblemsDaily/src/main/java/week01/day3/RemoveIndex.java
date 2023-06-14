package week01.day3;

import java.util.Arrays;

import org.testng.annotations.Test;

public class RemoveIndex {

	@Test
	public void TC1() {
		int[] arr = { 2, 1, 0, 5 };
		int index = 2;
		System.out.println(Arrays.toString(DeleteIndex(arr, index)));
	}

	@Test
	public void TC2() {
		int[] arr = { 2, 1, 4, 4, 5 };
		int index = 2;
		System.out.println(Arrays.toString(DeleteIndex(arr, index)));
	}
	
	@Test
	public void TC3() {
		int[] arr = { 2, 1, 4, 4, 5 };
		int index = 6;
		System.out.println(Arrays.toString(DeleteIndex(arr, index)));
	}
	
	@Test
	public void TC4() {
		int[] arr = { 4, 4, 4, 4, 4 };
		int index = 2;
		System.out.println(Arrays.toString(DeleteIndex(arr, index)));
	}

	public int[] DeleteIndex(int[] arr, int index) {

		if (index > arr.length) return arr;

		int numToRemove = arr[index]; 		// find the index number
		int[] output; 		                // Define new array length

		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == numToRemove) count++;
		}

		if (count == 0) return arr;       
		else if(count == arr.length) return new int[]{};
		else output = new int[arr.length - count];

		index = 0; //index for o/p array
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != numToRemove) output[index++] = arr[i];
		}

		return output;

	}

}

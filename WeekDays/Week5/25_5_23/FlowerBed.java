package leetCode;

import org.testng.annotations.Test;

public class FlowerBed {
	
	/*
	 * i = 0 and i+1 < arr.length and arr[i] != 1-arr[i+1] 
	 * i = arr.len-1 
	 * 
	 */
	
	@Test
	public void TC1() {
		int[] arr = {1,0,0,0,1,0,0};
		int n = 2;
		System.out.println(solveFlower(arr,n));
	}
	
	@Test
	public void TC2() {
		int[] arr = {0,0,1,0,1};
		int n = 1;
		System.out.println(solveFlower(arr,n));
	}
	
	@Test
	public void TC3() {
		int[] arr = {0, 1, 1,0,0};
		int n = 2;
		System.out.println(solveFlower(arr,n));
	}
	
	@Test
	public void TC4() {
		int[] arr = {1,0,0,0,0,0,1};
		int n = 2;
		System.out.println(solveFlower(arr,n));
	}
	
	
	@Test
	public void TC5() {
		int[] arr = {0};
		int n = 3;
		System.out.println(solveFlower(arr,n));
	}

	
	/*
	//Using Recursion 
	public boolean solveFlower(int[] flowerbed,int n) {
		if(flowerbed.length == 1) {
			return flowerbed[0] == 0;
		}
		return checkValid(0, 0, 1, n, flowerbed);
	
	}

	public boolean checkValid(int left, int mid, int right, int num, int[] arr) {
		if(num == 0) return true;
		if(mid >= arr.length || num < 0) return false;
		if(mid == arr.length-1) {
			left = mid-1;
			right = mid;
		}
		if(arr[left] == 0 && arr[mid] == 0 && arr[right] == 0) {
			num--;
			arr[mid] = 1;
		}
		return checkValid(mid, mid+1, mid+2, num, arr);
	}
	*/
	
	
	public boolean solveFlower(int[] flowerbed,int n) {
		
		for (int i = 0; i < flowerbed.length; i++) {
			
			if(flowerbed[i]==0 && (i==0 || flowerbed[i-1]==0) && (i == flowerbed.length-1|| flowerbed[i+1] == 0)) {
				flowerbed[i] = 1;
				n--;
			}
		}
		
		return n==0  ;
	
	}
	
	
	
}


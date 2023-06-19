package mandatoryHomeWork.week1.day1;

import java.util.Arrays;

import org.testng.annotations.Test;

public class ArrValueAsString {
	
	@Test
	/*
	 * Should we consider negative value as it is or change ?
	 */
	public void TC1() {
		int[] n = {-2 , 1 ,2 ,5};
        System.out.println(convertToString(n));
	}
	
	@Test
	public void TC2() {
		int[] n = {};
        System.out.println(convertToString(n));
	}
	
	@Test
	public void TC3() {
		int[] n = null;
        System.out.println(convertToString(n));
	}
	
	@Test
	public void TC4() {
		int[] n = {0,0,0};
        System.out.println(convertToString(n));
	}

	private String convertToString(int[] n) {
		if(n==null) {
			return "Array is NUll";
		}
		
		String empty = "";
		
		for(int i = 0 ; i<n.length ; i++) {
			empty += n[i];
		}
		
		return empty;
	}

}

package week01.day3;

import org.testng.annotations.Test;

public class PascalTriangle {

	@Test
	public void TC1() {
		int n = 5;
		pascalPyramid(n);
		System.out.println();
	}
	
	@Test
	public void TC2() {
		int n = 2;
		pascalPyramid(n);
		System.out.println();
	}

	@Test
	public void TC3() {
		int n = -1;
		pascalPyramid(n);
		System.out.println();
	}

	public void pascalPyramid(int n) {
		
		if(n<1) {
			System.out.println("invalid input");
			return ;
		}

		for(int i = 0 ; i <n ;i++) {
			for(int j = 0 ; j<=i ;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = 1 ; i <n ;i++) {
			for(int j = n-i ; j>0 ;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

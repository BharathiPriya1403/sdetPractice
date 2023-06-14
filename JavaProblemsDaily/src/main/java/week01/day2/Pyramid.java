package week01.day2;

import org.testng.annotations.Test;

public class Pyramid {

	@Test
	public void TC1() {
		int n = 2;
		printPyramid(n);
	}
	
	@Test
	public void TC2() {
		int n = 5;
		printPyramid(n);
	}
	
	@Test
	public void TC3() {
		int n = 1;
		printPyramid(n);
	}
	
	@Test
	public void TC4() {
		int n = -1;
		printPyramid(n);
	}

	public void printPyramid(int n) {

		if (n <= 0) {
			System.out.println("invalid input");
		}

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int j = n - i + 1; j <= n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		for (int i = 1; i <= n; i++) {
			for (int j = n - i + 1; j <= n; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= n - i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}

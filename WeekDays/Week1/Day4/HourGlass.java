package patternProblems;

import org.testng.annotations.Test;

public class HourGlass {
	
	@Test
	public void TC1() {
		int n = 5;
		sandGlass(n);
		System.out.println();
	}
	
	@Test
	public void TC2() {
		int n = 2;
		sandGlass(n);
		System.out.println();
	}
	
	@Test
	public void TC3() {
		int n = 1;
		sandGlass(n);
		System.out.println();
	}
	
	@Test
	public void TC4() {
		int n = -1;
		sandGlass(n);
		System.out.println();
	}
	
	public void sandGlass(int n) {
		
		if(n<1) {
		System.out.println("invalid input");
		return;}
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j<i; j++) System.out.print(" ");		
			for (int j = 1; j <=n-i+1; j++) System.out.print("* ");		
			System.out.println();
		}
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) System.out.print(" ");
			for (int j = n - i + 1; j <= n; j++) System.out.print("* ");
			System.out.println();
		}

	}

}

package mandatoryHomeWork.week1.day1;

import org.testng.annotations.Test;

public class LeftRightTriangle {
	
	@Test
	public void TC1() {
		int n = 5;
		star(n);
	}
	
	@Test
	public void TC2() {
		int n = 2;
		star(n);
	}

	@Test
	public void TC3() {
		int n = -1;
		star(n);
	}
	
	private void star(int n) {
		
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
		
	}

}

package patternProblems;

import org.testng.annotations.Test;

public class Diamond {
	
	/**
	 * TC -O((char-'A')^2)
	 * SC - O(1)
	 */

	@Test
	public void TC1() {
		char ch = 'F';
		alphaDiamond(ch);
	}

	public void alphaDiamond(char ch) {

		int n = (ch - 'A');

		for (int i = 0; i <=n; i++) {
			for (int j = 0; j <=(n - i - 1); j++) System.out.print(" ");
			System.out.print((char) ('A' + i));
			for (int k = 1; k <2*i; k++) System.out.print(" ");
			if (i != 0) System.out.print((char)('A' + i));
			System.out.println();
		}
		
		for (int i = n-1; i >=0; i--) {
			for (int j = (n - i - 1); j >= 0; j--) System.out.print(" ");
		    System.out.print((char) ('A' + i));
			for (int k = 1; k <2*i; k++) System.out.print(" ");
			if (i != 0) System.out.print((char)('A' + i));
			System.out.println();
		}
		

	}

}

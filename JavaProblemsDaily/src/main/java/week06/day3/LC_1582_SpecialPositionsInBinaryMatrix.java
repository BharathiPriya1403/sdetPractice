package week06.day3;

import org.testng.annotations.Test;

public class LC_1582_SpecialPositionsInBinaryMatrix {

	@Test
	public void TC1() {
		int[][] mat = { { 1, 0, 0 }, { 0, 0, 1 }, { 1, 0, 0 } };
		System.out.println(numSpecial(mat));

	}
	
	@Test
	public void TC2() {
		int[][] mat = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };
		System.out.println(numSpecial(mat));

	}

	public int numSpecial(int[][] mat) {
		int row = mat.length, col = mat[0].length, ans = 0;

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				int sum = 0;
				if (mat[i][j] == 1) {
					int r = 0;
					int c = 0;

					while (r < row) {
						sum += mat[r++][j];
					}

					while (c < col) {
						sum += mat[i][c++];
					}
				}

				if (sum == 2)
					ans++;
			}

		}

		return ans;

	}
}

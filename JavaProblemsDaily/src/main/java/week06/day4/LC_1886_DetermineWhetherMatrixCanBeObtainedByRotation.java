package week06.day4;

import java.util.Arrays;

import org.testng.annotations.Test;

public class LC_1886_DetermineWhetherMatrixCanBeObtainedByRotation {
	
	
	
	 //complexity: Time - O(n^2) & Space - O(1)

	@Test
	public void TC1() {
		int[][] mat = { { 0, 0, 0 }, { 0, 1, 0 }, { 1, 1, 1 } };
		int[][] target = { { 1, 1, 1 }, { 0, 1, 0 }, { 0, 0, 0 } };
		boolean ans = findRotation(mat, target);	
		System.out.println(ans);
	}

	public boolean findRotation(int[][] mat, int[][] target) {
		
		for (int i = 0; i < 4; i++) {
			if(checkTarget(mat, target)) return true;
			mat = diagonalSwap(mat);		
		}
		
		return false;
	}
	
	
	public boolean checkTarget(int[][] mat , int[][] target) {
		for (int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat.length; j++) {
				if(mat[i][j] != target[i][j]) return false;
			}
			
		}
		return true;
	}
	
	public int[][] diagonalSwap(int[][] mat){
		int len = mat.length;
		for (int i = 0; i < len; i++) {
			for (int j = i; j <len; j++) {
				int temp = mat[i][j];
				mat[i][j]=mat[j][i];
				mat[j][i]=temp;	
			}
		}
		
		for (int i = 0; i < len; i++) {
			int left = 0 ;
			int right = len-1;
			
			while(left<=right) {
				int temp = mat[i][left];
				mat[i][left]=mat[i][right];
				mat[i][right]=temp;	
				left++;
				right--;
			}
		}
		
		return mat;
		
	}
	
	public int[][] rowsSwap(int[][] mat){
		int len = mat.length;
		for (int i = 0; i < len; i++) {
			int left = 0 ;
			int right = len-1;
			
			while(left<right) {
				int temp = mat[i][left];
				mat[i][left]=mat[i][right];
				mat[i][right]=temp;	
				left++;
				right--;
			}
		}
		return diagonalSwap(mat);
		
	}

}

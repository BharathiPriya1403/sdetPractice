package leetCode;

public class LC_1572_MatrixDiagonalSum {
	
	/**
	 * TC- O(n)
	 * SC - O(1)
	 */
	
	public void TC1() {
		int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
		diagonalSum(mat);
	}
	
	
	
	
	 public int diagonalSum(int[][] mat) {
	        int ans = 0;
	        for(int i = 0 ; i<mat.length;i++){
	            ans+=mat[i][i];
	        }

	        int col = mat.length-1;
	        for(int i = 0 ; i<mat.length;i++){
	            ans+=mat[i][col--];
	        }

	        if(mat.length%2 != 0) ans-=mat[mat.length/2][mat.length/2];
	        return ans;
	    }

}

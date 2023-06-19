package mandatoryHomeWork.week6.day3;

public class LC_2319_CheckIfMatrixIs_X_Matrix {
	
	//Complexity: Time - O(n * m) & Space - O(1)
	
	
	public void TC1() {
		int[][] grid = {{2,0,0,1},{0,3,1,0},{0,5,2,0},{4,0,0,2}};
		checkXMatrix(grid);
	}
	
	
	 public boolean checkXMatrix(int[][] grid) {
	        int col = grid.length-1;
	        for(int i = 0; i < grid.length; i++){
	            if(grid[i][i] == 0) return false;
	            if(grid[i][col] == 0) return false;

	            for(int j = 0; j < grid.length; j++){
	                if(i != j &&  j != col && grid[i][j] != 0 ) return false;
	            }
	            col--;
	        }

	        return true;
	    }

}

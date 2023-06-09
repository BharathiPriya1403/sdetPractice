package leetCode;

import java.util.Arrays;

import org.testng.annotations.Test;

public class LC_832_FlippingAnImage {
	
	
	@Test
	public void TC1() {
		int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
		int[][] ima = flipAndInvertImage(image);
		for (int i = 0; i < ima.length; i++) {
			System.out.println(Arrays.toString(ima[i]));
			
		}
		
	}
		
		
		 public int[][] flipAndInvertImage(int[][] image){
			 
			 
			 
//			   for(int i = 0; i<image.length;i++){
//		             int left = 0 ;
//		             int right = image[i].length-1;
//		            
//		             while(left<right){
//		                 int temp = image[i][left]  ;
//		                 image[i][left] = image[i][right];
//		                 image[i][right]= temp;
//		                 left++;
//		                 right--;
//		             }
//		            
//		             for(int j = 0 ; j<image[i].length;j++){
//		                 image[i][j] = 1^image[i][j];
//		             }
//
//		         }

		 for (int i = 0; i < image.length; i++) {
						 int left = 0;
						 int right = image[i].length-1;
						 while(left<=right) {
							 int temp = image[i][left];
							 image[i][left] = 1-image[i][right];
							 image[i][right] = 1-temp;
							 left++;
							 right--;
						 }
					}
				 
					 
					return image;
	}

}

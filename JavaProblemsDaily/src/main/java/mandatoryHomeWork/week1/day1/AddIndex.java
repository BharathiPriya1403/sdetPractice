package mandatoryHomeWork.week1.day1;
	
	import java.util.Arrays;

	import org.testng.annotations.Test;

	public class AddIndex {
		
		@Test
		public void TC1() {
			int[] n = {-2 , 1 ,2 ,5};
	         int addNo = 6;
	         int index = -1;
	        System.out.println(Arrays.toString(insertNum(n,addNo,index)));
		}
		
		@Test
		public void TC2() {
			int[] n = {-2 , 1 ,2 ,5};
	         int addNo = 6;
	         int index = 0;
	        System.out.println(Arrays.toString(insertNum(n,addNo,index)));
		}
		
		@Test
		public void TC3() {
			int[] n = {-2 , 1 ,2 ,5};
	         int addNo = 6;
	         int index = 4;
	        System.out.println(Arrays.toString(insertNum(n,addNo,index)));
		}
		
		@Test
		public void TC4() {
			int[] n = {-2 , 1 ,2 ,5};
	         int addNo = 6;
	         int index = 8;
	        System.out.println(Arrays.toString(insertNum(n,addNo,index)));
		}

		public int[] insertNum(int[] n, int addNo, int index) {
			
			if(index<0) {
				return n;
			}
			
			int[] arr ;
			
			int save = -1;
			
			if(index<=n.length) {
				arr = new int[n.length+1];
			}else {
				int dex = (index-n.length)+1;
				arr = new int[n.length+dex];
			}
			
			
			for(int i = 0 ; i<n.length; i++) {
				if(i == index) {
					save = i;
					arr[i] = addNo;
					break;
				}
				arr[i] = n[i];
			}
			
			if(save!= -1) {
				for(int i = save ; i<n.length;i++) {
					arr[i+1] =n[i]; 
				}
			}else {
				arr[index] = addNo;
			}
			
			return arr;
			
			
		
		}
	}




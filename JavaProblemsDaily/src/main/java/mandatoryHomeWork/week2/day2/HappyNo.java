package mandatoryHomeWork.week2.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.testng.annotations.Test;

public class HappyNo {
	
	
	@Test
	public void TC1() {
		int left = 1;
		int right = 22;
		System.out.println(giveNumber(left , right));
	}

		public boolean countDigits(int num) {
	        
		   String sb = Integer.toString(num);
	       int count = 0 ;
	       int val = num;
	        while(val>9){
	            int quo = val/10;
	            int rem = val%10;

	            if(num%rem == 0){
	                count++;
	            }
	            val = quo ;
	            	       
	        }
	        
	        if(val<=9 && num%val==0) {
	        	count++;
	        }
	        
	        if(count != sb.length()) {
	        	return false;
	        }
	        return true ;
	    }
		
		public List<Integer> giveNumber(int left , int right) {
			
			List<Integer> ls = new ArrayList<Integer>();
			for (int i = left; i <=right; i++) {
				if(countDigits(i) == true) {
					ls.add(left);
				}
			}
			return ls;
			
		}
	
}

package week01.day3;

import org.testng.annotations.Test;

public class LC_231_PowerOfTwo {

	@Test
	public void TC1() {
		int n = 1;
		System.out.println(powerOfTwo(n));
	}

	public boolean powerOfTwo(int n) {
		
		if(n<1) {
			return false;
		}
			
       long i = 1;
       
       while(i<=n) {
    	   if(i==n) {
    		   return true;
    	   }
    	   i=i*2;
       }
	return false;
		
	}

}

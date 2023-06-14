package week03.day4;

import org.testng.annotations.Test;

public class LC_2269_FindTheKBeautyOfANumber {
	
	/**
	 * https://leetcode.com/problems/find-the-k-beauty-of-a-number/description/
	 * 
	 * TC - O(n)
	 * SC - O(1)
	 * 
	 */
	
	@Test
	public void TC1() {
		int num = 430043;
		int k = 2;
		System.out.println(divisorSubstrings(num,k));
	}
	
    public int divisorSubstrings(int num, int k) {
    	String s = Integer.toString(num);
    	int count = 0 ;
    	for(int i = 0 ; i<=s.length()-k;i++) {
    		int val = Integer.parseInt(s.substring(i,i+k));
    		if(  val!=0 && num%val == 0) {
    			count++;
    		}
    	}
    	
    	
		return count;
    }

}

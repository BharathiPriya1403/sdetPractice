package week03.day1;

public class LC_1876_SubstringsOfSizeThreeWithDistinctCharacters {
	
	/**
	 * https://leetcode.com/problems/substrings-of-size-three-with-distinct-characters/description/
	 * 
	 * TC - O(n)
	 * SC - O(1)
	 * 
	 * have 3 pointers and check all three are distinct - if yes increment the ans 
	 * 
	 */
	
	public void TC1() {
		String s = "xyzzaz";
		countGoodSubstrings(s);
	}
	
	
	 public int countGoodSubstrings(String s) {
	        int ans = 0 ;
	         
	         for(int i = 1 ; i<=s.length()-2;i++) {
	        	 if(s.charAt(i)!=s.charAt(i+1) && s.charAt(i)!=s.charAt(i-1) && s.charAt(i+1)!=s.charAt(i-1)) {
	        		 ans++;  
	        	 }
	        	 
	        	
	         }
			return ans;
	    }

}

package mandatoryHomeWork.week5.day2;

public class LC_392_IsSubsequence {
	
	/**
	 * TC - O(n*m)
	 * SC - O(1)
	 * 
	 */
	
	
	public void TC1() {
		String s = "abc";
		String t = "ahbgdc";
		isSubsequence(s,t);
	}

	 public boolean isSubsequence(String s, String t) {
	        
	        int i = 0 ;
	        int j = 0 ;
	        while(i<t.length() && j<s.length()){
	        if (s.charAt(j) == t.charAt(i)) j++;
	        i++;
	        }
	       return j==s.length();
	    }
}

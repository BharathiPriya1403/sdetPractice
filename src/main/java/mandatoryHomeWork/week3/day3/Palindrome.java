package mandatoryHomeWork.week3.day3;

import org.testng.annotations.Test;

public class Palindrome {
	
	@Test
	public void TC1() {
		String A = "abca";
		System.out.println(validPalindrome(A));
	
	}

	 public boolean validPalindrome(String s) {
	        
	       int i = 0, j = s.length() - 1;
	        
	        while (i < j) {
	            if (s.charAt(i) != s.charAt(j)) {
	                return isPalindrome(s, i + 1, j) || isPalindrome(s, i, j - 1);
	            }
	            i++;
	            j--;
	        }

	        return true;
	    }
	    
	   
	    private boolean isPalindrome(String s, int i, int j) {
	        
	        while (i < j) {
	            if (s.charAt(i) != s.charAt(j)) {
	                return false;
	            }
	            i++;
	            j--;
	        }
	        
	        return true;
	    }

	

}

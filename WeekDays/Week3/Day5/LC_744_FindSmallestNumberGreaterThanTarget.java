package dailyProb;

import org.testng.annotations.Test;

public class LC_744_FindSmallestNumberGreaterThanTarget {
	
	
	
	@Test
	public void TC1() {
		char[] letters = {'c','f','j'};
		char target = 'a';
	}
	
	
	 public char nextGreatestLetter(char[] letters, char target) {
	        char ans = target;
	        int j = letters.length-1;
	        while(j >=0 && letters[j] > target){
	            ans = letters[j--];
	        }
	        return ans == target ? letters[0] : ans;
	    }

}

import java.util.Arrays;

import org.testng.annotations.Test;

public class MergeStringsAlternately {
	
	/**
	 * https://leetcode.com/problems/merge-strings-alternately/description/
	 * 
	 * Pseudo Code:
	 * Initialize a stringbuilder to add the strings to it .
	 * iterate till word1.length and word2.length and add the word1 first then word2 into temp
	 * to handle oddnumber lengths
	 * check if i is less than word than of length if so iterate and add it to the last and same for word2.length
	 * 
	 * TC - O(n)
	 * SC - O(1)
	 * 
	 */
	
	
	@Test
	public void TC3() {
		String word1 = "abc";
		String word2 = "pqr";
		System.out.println(mergeAlternately(word1,word2));
	}
	
	
	 public String mergeAlternately(String word1, String word2) {
	        StringBuilder temp = new StringBuilder();
	        int i = 0 ;
	       // int j = 0 ;

	        while(i<word1.length() && i<word2.length()){
	          temp.append(word1.charAt(i));
	          temp.append(word2.charAt(i));
	          i++;
	          //j++;
	        }

	        while(i<word1.length()){
	        temp.append(word1.charAt(i));
	          i++;
	        }



	        while(i<word2.length()){
	         temp.append(word2.charAt(i));
	          i++;
	        }
	        
	        return temp.toString();

	    }

}

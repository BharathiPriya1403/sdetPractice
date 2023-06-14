package week02.day4;
import org.testng.annotations.Test;


public class LC_2000_ReversePrefixOfWord {
	
	/**
	 * https://leetcode.com/problems/reverse-prefix-of-word/description/
	 * 
	 * Pseudo code:
	 * 
	 * iterate and find the index of ch and store it in variable - j 
	 * iterate backward from character found index to 0	 and append in stringbuilder
	 * store character found index +1 in an variable 
	 * if the index is less than string length append it in stringbuilder
	 * 
	 * 
	 * TC - O(n);
	 * SC - O(n)
	 * 
	 */
	
	
	@Test
	public void TC1() {
	String word = "abcdefd";
	char ch = 'd';
	System.out.println(reversePrefix(word,ch));
	}
	
	
	public String reversePrefix(String word, char ch) {
        int i = 0;
        int j = 0;
        StringBuilder sb = new StringBuilder();

        while(i<word.length()){
            if(word.charAt(i)==ch){
              j = i;
              break;
            }
            i++;
        }

        int index = j+1;
        while(j>=0){
            sb.append(word.charAt(j));
            j--;
        }

        while(index<word.length()){
            sb.append(word.charAt(index));
            index++;
        }

        return sb.toString();
    }
	

}

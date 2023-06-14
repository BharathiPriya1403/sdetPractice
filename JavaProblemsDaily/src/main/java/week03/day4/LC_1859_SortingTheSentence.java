package week03.day4;

import java.util.Arrays;
import java.util.Comparator;

import org.testng.annotations.Test;


public class LC_1859_SortingTheSentence {
	
	
	@Test
	public void TC1() {
		String s = "is2 sentence4 This1 a3";
		System.out.println(sentenceSorting(s));
	}

	private String sentenceSorting(String s) {
		String s1[] = s.split(" ");
		String res[] = new String[s1.length];
		System.out.println(Arrays.toString(s1));
		
		for (int i = 0; i < s1.length; i++) {
			char index = s1[i].charAt(s1[i].length()-1);
			System.out.println(index);
			res[index-'0'-1] = validString(s1[i]);
		
		}
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i <res.length;i++) {
			sb.append(res[i] );
			if(i < res.length-1) sb.append(" ");
		}
		
		return sb.toString();
		
	}
	
	public String validString(String s) {
		StringBuilder sb = new StringBuilder(s);
		sb.replace(s.length()-1, s.length(), "");
		return sb.toString();
        
    }
	
	
}

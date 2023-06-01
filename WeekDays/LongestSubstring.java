package dailyProb;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import org.testng.annotations.Test;

public class LongestSubstring {
	
	
	@Test
	public void TC1() {
		String s = "pwwkew";
		System.out.println(lengthOfLongestSubstring(s));
		
	}
	
	
	public int lengthOfLongestSubstring(String s) {
	    int len = s.length(), ans=0;
	        Map<Character,Integer> ht = new HashMap(); 
	        for(int i=0,j=0;j<len;j++){
	            if(ht.containsKey(s.charAt(j)))i=Math.max(ht.get(s.charAt(j)),i);
	            ans=Math.max(ans,j-i+1);
	            ht.put(s.charAt(j),j+1);
	        }
	        return ans;
		}
	
}


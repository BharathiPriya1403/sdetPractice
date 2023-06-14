package week01.day5;

import org.testng.annotations.Test;

public class LC_1688_CountOfMatchesInTournament {
	
	/**
	 * https://leetcode.com/problems/count-of-matches-in-tournament/
	 * Time complexity O(logn) and O(1)
	 * Space complexity O(1)
	 */
	
	/**
	 * Pseudo code
	 * 1 team will get eliminated in each match hence return n-1 
	 */
	
	@Test
	public void TC1() {
		int n = 7 ;
		System.out.println(numberOfMatches(n));
		
	}
	
	
	@Test
	public void TC2() {
		int n = 6 ;
		System.out.println(numberOfMatches(n));
		
	}
	
	    public int numberOfMatches(int n) {

//	     int matches = 0;
//	     while(n>1){
//	         matches += n/2;
//	         int team = n/2;
//	         if(n%2!=0){
//	           team++;
//	         }
//	         n = team;
//	     }
//	         return matches;	         
	         
         return n-1;
	    }
	}	




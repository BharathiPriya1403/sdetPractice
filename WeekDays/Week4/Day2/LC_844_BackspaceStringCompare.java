package stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import org.testng.annotations.Test;

public class LC_844_BackspaceStringCompare {
	
	/**
	 * https://leetcode.com/problems/backspace-string-compare/description/
	 * Tc - O(s+t)
	 * SC -O(s.len+t.len)
	 * 
	 */

	@Test
	public void TC1() {
		String s = "ab#c";
		String s1 = "ad#c";
		System.out.println(backspaceCompare(s, s1));
	}

	@Test
	public void TC2() {
		String s = "ab##";
		String s1 = "c#d#";
		System.out.println(backspaceCompare(s, s1));
	}
	
	@Test
	public void TC3() {
		String s = "bxj##tw";
		String s1 = "bxj###tw";
		System.out.println(backspaceCompare(s, s1));
	}
	
	

	public boolean backspaceCompare(String s, String t) {

		Stack<Character> st1 = new Stack<>();
		Stack<Character> st2 = new Stack<>();

		int i = 0;
		while (i < s.length()) {
			if (s.charAt(i) != '#') {
				st1.push(s.charAt(i));
				
			}else if(!st1.isEmpty()) {
					st1.pop();
				
			}
			i++;
		}
		
		i = 0;
		while (i < t.length()) {
			if (t.charAt(i) != '#') {
				st2.push(t.charAt(i));
				
			}else if(!st2.isEmpty()) {
					st2.pop();
				
			}
			i++;
		}
		
		if(st1.size()!=st2.size())return false;
		
		while(!st1.isEmpty() && !st2.isEmpty()) {
			if(st1.pop()!=st2.pop()) return false;
		}

		return true;

	}



}
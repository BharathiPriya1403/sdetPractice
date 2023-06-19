package mandatoryHomeWork.week4.day3;

import java.util.Stack;

import org.testng.annotations.Test;

public class LC_1047_RemoveAllAdjacentDuplicatesInString {
	
	@Test
	public void TC1(){
		String s = "abbaca";
		System.out.println(removeDuplicates(s));
		
	}
	
	
	 public String removeDuplicates(String s) {
		 
		 Stack<Character> stack = new Stack<>();
		 
		 stack.push(s.charAt(0));
		 
		 for (int i = 1; i < s.length(); i++) {
			 if(!stack.isEmpty() && stack.peek() == s.charAt(i) ) stack.pop();
			 else stack.push(s.charAt(i));
		
		}
		 
		 StringBuilder sb = new StringBuilder();
		 while(!stack.isEmpty()) {
			 sb.append(stack.pop());
		 }
		 
	
		 
		return  sb.reverse().toString();
	        
	    }


}

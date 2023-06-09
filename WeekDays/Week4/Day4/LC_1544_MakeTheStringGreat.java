package stack;

import java.util.Stack;

import org.testng.annotations.Test;

public class LC_1544_MakeTheStringGreat {
	
	@Test
	public void TC1(){
		String s = "Pp";
		System.out.println(makeGood(s));
		
	}
	
	
	 public String makeGood(String s) {

		 Stack<Character> stack = new Stack<>();
	        
	        stack.push(s.charAt(0));

	        for(int i = 1 ; i<s.length();i++){
	          if(!stack.isEmpty() && (Math.abs(stack.peek()-s.charAt(i))==32)){
	        	  stack.pop();
	          }
	          else stack.push(s.charAt(i));
	        }
	        
	        StringBuilder sb = new StringBuilder();
			 while(!stack.isEmpty()) {
				 sb.append(stack.pop());
			 }
			 
		
			 
			return  sb.reverse().toString();	        
	        
	    }

}

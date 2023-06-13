package stack;

import java.util.Stack;

import org.testng.annotations.Test;

public class LC_1678_GoalParserInterpretation {
	
	@Test
	public void TC1() {
		String command = "G()()()()(al)";
		System.out.println(interpret(command));
	}
	
	 public String interpret(String command) {
		 
		 String output = "";
		 char prev = command.charAt(0);
		 for (int i = 0; i < command.length(); i++) {
			 char cur = command.charAt(i);
			 if(cur == 'G') {
				 output+=cur;
				 prev = cur;
			 }else if(cur == '(') {
				 prev = cur;
			 }else if(cur == ')' && prev == '(') {
				 output+='o';
				 prev = cur;
			 }else if(cur == 'a' || cur == 'l') {
				 output+=cur;
				 prev = cur;
			 }
		}
		 
		return output;


	    }

}

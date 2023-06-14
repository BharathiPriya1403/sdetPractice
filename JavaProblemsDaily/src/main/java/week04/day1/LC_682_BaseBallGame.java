package week04.day1;

import java.util.Stack;

import org.testng.annotations.Test;

public class LC_682_BaseBallGame {
	
	
	@Test
	public void TC1() {
		String[] str = {"5","2","C","D","+"};
		baseBallGame(str);
	}
	
	
	public int baseBallGame(String[] operations) {
		
		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < operations.length; i++) {

			if (operations[i].equals("C")) {

				if (!stack.isEmpty())
					stack.pop();
			} else if (operations[i].equals("D")) {

				if (!stack.isEmpty()) {
					stack.push(stack.peek() * 2);
				}
			} else if (operations[i].equals("+")) {
				if (stack.size() >= 2) {
					int firstVal = stack.pop();
					int sum = firstVal + stack.peek();
					stack.push(firstVal);
					stack.push(sum);
				}
			} else
				stack.push(Integer.valueOf(operations[i]));

		}
       
		
		int ans = 0;
		while (!stack.isEmpty()) {
			ans += stack.pop();
		}

		return ans;
    }
		
	

}

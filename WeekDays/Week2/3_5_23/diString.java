import org.testng.annotations.Test;

public class diString {
	
	/**
	 * https://leetcode.com/problems/di-string-match/
	 * 
	 * pseudo code:
	 * output should be input length+1;
	 * create an input array [n+1]
	 * fill the output array in such a way that everytime u see I increment and i starts from 0
	 * if D decrement and D starts from length.
	 * the n+1 index will be common num , so can fill either with i or D
	 * 
	 * TC = O(n+1)
	 * SC = O(n)
	 * 
	 * 
	 */
	
	@Test
	public void TC1() {
		String n = "IDID";
		diStringMatch(n);
	}

	
	 public int[] diStringMatch(String s) {
		    int[] update = new int[s.length()+1];
		    int k = 0;
		    int j = s.length();

		    for(int i = 0 ; i<s.length();i++ ){
		        if(s.charAt(i)=='I'){
		            update[i] = k++; 
		        }else update[i] = j--;
		    }
		    update[s.length()] = j;
		    return update;
		    }
}


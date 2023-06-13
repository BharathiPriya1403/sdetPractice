package leetCode;

import org.testng.annotations.Test;

public class LC_917_ReverseOnlyLetters {
	
	@Test
	public void TC1() {
		String str = "Test1ng-Leet=code-Q!";
		String ans = reverseOnlyLetters(str);
		System.out.print(ans);
	}
	
	 public String reverseOnlyLetters(String s) {
		    String ans = "";
		    char[] ch = s.toCharArray();
		    int i = 0 ;
		    int j = s.length()-1;
		    while(i<=j){
		    	char one = ch[i];
		    	char two = ch[j];
		    	if(Character.isLetter(one) && Character.isLetter(two)){
		    		char temp = ch[i];
		    		ch[i++] = ch[j];
		    		ch[j--] = temp;
		    	}else if(!Character.isLetter(one)) {
		    		i++;
		    	}else {
		    		j--;
		    	}
		    }
		    
		    for(int k = 0; k < ch.length; k++) {
		    	ans+=ch[k];
		    }
		    
			return ans.toString();
	 }


}

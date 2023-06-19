package mandatoryHomeWork.week8.day1;

public class HC_GameOfThrones {
	
	
	public static String gameOfThrones(String s) {
	    // Write your code here
	    
	    int[] check = new int[26];
	    
	    for(int i = 0 ; i<s.length();i++){
	        int index = s.charAt(i)-'a';
	        if(check[index]>0) check[index]--;
	       else check[index]++;
	    }
	    
	    
	  int sum = 0;
	    for(int i = 0 ; i<check.length;i++){
	        sum += check[i];
	        if(sum>1) return "NO";
	    }
	    
	    return "YES";

	    }

	}



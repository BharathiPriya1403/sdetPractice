package leetCode;

public class LC_1221_SplitAStringInBalancedStrings {
	
	public void TC1() {
		String s   = "RLRRLLRLRL";
		balancedStringSplit(s);
	}
	
	
	  public int balancedStringSplit(String s) {
	        int countR = 0 ;
	        int countL = 0 ;
	        int output = 0 ;
	        int i = 0 ;
	        while(i<s.length()){
	            if(s.charAt(i)=='R'){    
	            countR++;
	           
	            }else countL++;

	            if(countR==countL){
	                countR = 0;
	                countL = 0;
	                output++;
	            }
	          i++;
	        }
	        return output;
	    }

}

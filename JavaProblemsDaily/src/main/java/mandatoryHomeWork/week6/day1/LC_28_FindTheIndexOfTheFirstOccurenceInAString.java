package mandatoryHomeWork.week6.day1;

public class LC_28_FindTheIndexOfTheFirstOccurenceInAString {
	
	public void TC1() {
		String haystack = "sadbutsad";
		String needle = "sad";
		
		strStr(haystack,needle);
	}
	
	 public int strStr(String haystack, String needle) {
	        // int h = 0;
	        
	        // while(h<haystack.length()){
	        //       if(haystack.charAt(h)==needle.charAt(0)){
	        //           int temp = h;
	        //           int n = 0 ;

	        //           while(temp<haystack.length() && n<needle.length() && haystack.charAt(temp)==needle.charAt(n))     {
	        //         temp++;
	        //         n++;
	        //           }
	        //           if(temp-h == needle.length()) return h;
	        //       }
	        //       h++;
	        // }

	        // return -1;
	        int k = needle.length();
	    for(int i = 0; i <= haystack.length()-k; i++){
	        if(haystack.substring(i, k+i).equals(needle)) return i;
	    }

	    return -1;
	    }


}

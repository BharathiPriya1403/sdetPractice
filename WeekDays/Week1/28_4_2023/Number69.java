package leetCode;

import org.testng.annotations.Test;

public class Number69 {
	
	/**
	 * TC -O(n) 
	 * SC -O(1)
	 * 
	 * Pseudo code:
	 * convert the int to string 
	 * and check the whether first index is 6 if so change to 9 and return the ans 
	 * initialize a boolean flag to check if we have replaced 6 with 9
	 * 
	 */
	
	@Test
	public void TC1() {
		int num = 9669;
		System.out.println(maximum69Number(num));
	}
	
	@Test
	public void TC2() {
		int num = 9996;
		System.out.println(maximum69Number(num));
	}

	@Test
	public void TC3() {
		int num = 9999;
		System.out.println(maximum69Number(num));
	}
	
	@Test
	public void TC4() {
		int num = 6669;
		System.out.println(maximum69Number(num));
	}
	
//	public int maximum69Number (int num) {
//
//        String s = String.valueOf(num);
//        String ans = "";
//         
//        int i = 0;
//        boolean flag = false;
//        while(i<s.length()){
//            if(s.charAt(i)=='6' && !flag){
//                ans+= '9';
//                flag = true;
//            } else{
//                ans += s.charAt(i);
//            }
//            i++;
//        }
//       return Integer.valueOf(ans);      
//    }
	
	public int maximum69Number (int num) {

        String s = String.valueOf(num);
        char[] ch = s.toCharArray();
        
        for(int i = 0 ; i<ch.length;i++) {
        	if(ch[i]=='6') {
        		ch[i]='9';
        		break;
        	}
        }
        
       return Integer.parseInt(String.valueOf(ch));
       
       
    }
}

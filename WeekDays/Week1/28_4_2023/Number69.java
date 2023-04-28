package leetCode;

import org.testng.annotations.Test;

public class Number69 {
	
	/**
	 * TC -O(n) 
	 * SC -O(1)
	 * 
	 * Pseudo code:
	 *convert int to string to char array  
	 * for loop - if i = 6 convert to 9 and break 
	 * convert the char array to string and return as int
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
	
// 	public int maximum69Number (int num) {

//         String s = String.valueOf(num);
//         char[] ch = s.toCharArray();
        
//         for(int i = 0 ; i<ch.length;i++) {
//         	if(ch[i]=='6') {
//         		ch[i]='9';
//         		break;
//         	}
//         }
        
//        return Integer.parseInt(String.valueOf(ch));
		
		public int maximum69Number (int num) {
		
		int max = num ;
		int prevTotal = 0;
		int mul = 1;
		
		while(num>9) {
			int digits = num%10;
			int quotient = num/10;
			prevTotal += digits*mul;
			if(digits == 6) {
				int temp = (quotient*10*mul) + (prevTotal+ (3*mul));
				max = Math.max(max, temp);
			}
			num = quotient;
			mul = mul*10;
		}
		
		if(num == 6) {
			int temp = (9*mul) + (prevTotal);
			max = Math.max(max, temp);
		}
			
		return max;
       
       
    }
}

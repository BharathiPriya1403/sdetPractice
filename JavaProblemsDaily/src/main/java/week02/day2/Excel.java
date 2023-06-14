package week02.day2;

import org.testng.annotations.Test;

public class Excel {
	
	
	@Test
	public void TC1() {
		int num = 702;
		System.out.println(findExcelValue(num));
	}

	public String findExcelValue(int num) {
		//String output = "";
		StringBuilder sb = new StringBuilder();
		
		while (num > 0) {
			int quo = num / 26;
			int rem = num % 26;
			if(rem == 0) {
			//output += "Z";
			sb.append("Z");
			num = quo-1;
			}else {
			//output += (char)((rem-1)+'A');  
				sb.append((char)((rem-1)+'A'));
			num = quo;}
		}

		return (sb.reverse().toString());

	}

}

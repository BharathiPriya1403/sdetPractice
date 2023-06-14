package week01.day2;

import org.testng.annotations.Test;

public class LC_258_AddDigits {

	@Test
	public void TC1() {
		int num = 10;
		System.out.println(some(num));
	}

	// Without DataStructure
	public int addDigits(int num) {

		if (num < 10) {
			return num;
		}

		int sumDigits = 0;
		int rem = 0;
		int quo = 0;

		while (num > 9) {
			rem = num % 10;
			quo = num / 10;
			sumDigits = rem + quo;
			num = sumDigits;
		}
		return sumDigits;
	}

	public int some(int sum) {
		int ans = addDigits(sum);
		while (ans > 9) {
			ans = addDigits(ans);
		}

		return ans;
	}

	//1+(num-1)%9
	//Using Recursion
//	public int addDigits(int num) {
//		if (num < 10) {
//			return num;
//		}
//		int sum = 0;
//		int quo = 0;
//		int rem = 0;
//
//		while (num > 9) {
//			quo = num / 10;
//			rem = num % 10;
//			sum = quo + rem;
//			num = sum;
//		}
//	                
//		return addDigits(sum);  
//
//	    }
}

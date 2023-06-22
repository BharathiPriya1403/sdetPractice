package mandatoryHomeWork.week2.day5;

import java.util.Arrays;

import org.testng.annotations.Test;

public class LC_2000_ReversePrefixOfWord {

	/**
	 * https://leetcode.com/problems/reverse-words-in-a-string-iii/
	 * 
	 * TC - O(n^2)
	 * SC - O(n)
	 */

	@Test
	public void TC1() {
		String A = "let's make this possible";
		System.out.println(reverseWords(A));

	}

	public String reverseWords(String s) {

		String[] s1 = s.split(" ");
		System.out.println(Arrays.toString(s1));

		for (int i = 0; i < s1.length; i++) {

			char[] ch = s1[i].toCharArray();

			int left = 0;
			int right = ch.length - 1;
			while (left < right) {
				char temp = ch[left];
				ch[left] = ch[right];
				ch[right] = temp;
				left++;
				right--;
			}

			s1[i] = new String(ch);
			System.out.println(Arrays.toString(ch));

		}

		return String.join(" ", s1);

	}

}

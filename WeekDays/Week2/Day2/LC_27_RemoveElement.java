package dailyProb;
import java.util.Arrays;

import org.testng.annotations.Test;

public class LC_27_RemoveElement {

	/**
	 * https://leetcode.com/problems/remove-element/description/
	 * 
	 * TC- O(nlogn) 
	 * SC - O(1)
	 * 
	 * @param nums
	 * @param val
	 * @return
	 */

	@Test
	public void TC1() {
		int[] nums = { 3, 2, 2, 3 };
		int val = 3;
		System.out.println(removeElementNo(nums, val));
	}

	public int removeElementNo(int[] nums, int val) {
		int k = 0;
		int zero = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == val) {
				nums[i] = 0;
				k++;
			} else if (nums[i] == 0) {
				zero++;
			}
		}
		Arrays.sort(nums);
		int right = nums.length - 1;
		while (zero < right) {
			int temp = nums[zero];
			nums[zero] = nums[right];
			nums[right] = temp;
			zero++;
			right--;
		}
		return nums.length - k;
	}

}

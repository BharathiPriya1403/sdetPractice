import java.util.Arrays;

import org.testng.annotations.Test;

public class MoveZero {

	/**
	 * 2 pointer approach 
	 * i and j start from 0 and both goes till array length 
	 * if j != 0 do the swap and increment i
	 * and increment j
	 * 
	 *TC - O(n)
	 *SC - O(1)
	 */

	@Test
	public void TC1() {

		int[] nums = {0,1,0,3,12};
		System.out.println(Arrays.toString(moveZeroes(nums)));
	}

	public int[] moveZeroes(int[] nums) {
		int i = 0;
		int j = 1;
		while (i < nums.length && j < nums.length) {
			if (nums[j] != 0) {
				int temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;
				i++;
			}
			j++;
		}
		return nums;

	}
}
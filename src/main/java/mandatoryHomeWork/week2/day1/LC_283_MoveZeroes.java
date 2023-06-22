package mandatoryHomeWork.week2.day1;
import java.util.Arrays;

import org.testng.annotations.Test;

public class LC_283_MoveZeroes {

	/**
	 * 2 pointer approach 
	 * i and j start from 0 and both goes till array length 
	 * if j != 0 do the swap and increment i
	 * and increment j
	 * 
	 *TC - O(n)
	 *SC - O(1)
	 *
	 *Note: i = 0 , j =1 will not work if there is only 2 number in an array and if j!=0 it will swap the numbers and order will change 
	 *Hence starting both with 0
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
		//System.out.println((char)('A'+));
		return nums;

	}
}
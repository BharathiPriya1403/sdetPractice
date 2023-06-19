package mandatoryHomeWork.week4.day2;
import java.util.Arrays;

import org.testng.annotations.Test;

public class LC_83_RemoveDuplicatesFromSortedList {
	
	/**
	 * 2 pointer approach
	 * i starts from 0 and j starts from 1 - while loop both i and j < nums.length
	 * if i and j are equal update j as -102 cuz the constrant is -100 to +100
	 * update prev with i value
	 * if i and j not equal compare whether prev and j is equal - if yes assign 102 to j and update prev with j value
	 * i++ , j--;
	 * Use the move zero program to move all the -102 to end 
	 * keep a variable as count and increment it whenever 102 is updated
	 * return nums length - count
	 * 
	 * TC - O(n) if move zero program is used 
	 * TC -  nlogn if sort is used 
	 * SC - O(1)
	 */

	@Test
	public void TC1() {
		int[] num = {1,1,2};
		System.out.println(removeDuplicates(num));
	}

	public int removeDuplicates(int[] nums) {

		int i = 0;
		int j = 1;
		int prev = 102;
		int count = 0 ;

		while (i<nums.length && j < nums.length) {

			if (nums[i] == nums[j]) {
				nums[j] = 102;
				prev = nums[i];
				count++;
			} else if (prev == nums[j]) {
				prev = nums[j];
				nums[j] = 102;
				count++;
			}
			i++;
			j++;
		}
		//Arrays.sort(nums); 
		//System.out.println(Arrays.toString(nums));
		return nums.length - count;

	}

	public void moveZeroes(int[] nums) {
		int i = 0;
		int j = 0;
	
		while (i < nums.length && j < nums.length) {
			if (nums[j] != -102) {
				int temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;
				i++;
			}
			j++;
		}
		
}

}
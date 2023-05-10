package dailyProb;

import java.util.Arrays;
import java.util.HashMap;

import org.testng.annotations.Test;

public class SortPeople {
	
	/**
	 * https://leetcode.com/problems/sort-the-people/
	 * 
	 * TC-O(nlogn)
	 * SC - O(n)
	 * 
	 */

	@Test
	public void TC1() {
		String[] names = { "Mary", "John", "Emma" };
		int[] heights = { 180, 165, 170 };
		System.out.println(Arrays.toString(sortPeople(names, heights)));
	}

	public String[] sortPeople(String[] names, int[] heights) {

		HashMap<Integer, String> hm = new HashMap<>();

		for (int i = 0; i < names.length; i++) {
			hm.put(heights[i], names[i]);
		}

		Arrays.sort(heights);

		int index = 0;
		for (int i = heights.length - 1; i >= 0; i--) {
			names[index++] = hm.get(heights[i]);
		}

		return names;
	}

//	public String[] sortPeople(String[] names, int[] heights) {
//		String[] output = new String[names.length];
//		int max = 0;
//		int min = heights[heights.length - 1];
//
//		for (int i = 0; i < heights.length; i++) {
//			max = Math.max(max, heights[i]);
//			min = Math.min(min, heights[i]);
//		}
//
//		int[] indexAr = new int[max + 1];
//
//		for (int i = 0; i < heights.length; i++) {
//			indexAr[heights[i]] = i + 1;
//		}
//
//		max = 0;// reusing for index
//
//		for (int i = indexAr.length - 1; i >= 0 && i >= min; i--) {
//			if (indexAr[i] != 0) {
//				int height = indexAr[i] - 1;
//				output[max++] = names[height];
//			}
//
//		}
//
//		return output;
//	}

}

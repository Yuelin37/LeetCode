/**
 * 169. Given an array of size n, find the majority element.
 * The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 * You may assume that the array is non-empty and the majority element always exist in the array.
 * Credits:
 * Special thanks to @ts for adding this problem and creating all test cases.
 */
package ylyan.leetcode;

import java.util.Arrays;

public class MajorityElement {
	public int majorityElement(int[] num) {

		return (method1Pass(num));
	}

	public int leedcodeSolution(int[] num) {
		int vote = num[0];
		int count = 1;
		int size = num.length;
		// vote from the second number
		for (int i = 1; i < size; i++) {
			if (count == 0) {
				vote = num[i];
				count++;
			} else if (vote == num[i])
				count++;
			else
				count--;
		}
		return vote;
	}

	public int method1Pass(int[] num) {
		int n = num.length;
		int cur = 0;
		int majority = 0, majorCount = 0;
		int[] tmp = new int[n / 2 + 1];
		int[] tmpCount = new int[n / 2 + 1];
		tmp[0] = num[0];

		boolean added = false;

		for (int i = 0; i < n; i++) {
			added = false;
			for (int j = 0; j <= cur; j++) {
				if (num[i] == tmp[j]) {
					added = true;
					tmpCount[j]++;
					break;
				}
			}
			if (!added) {
				cur++;
				tmp[cur] = num[i];
				tmpCount[cur]++;
			}
		}

		majority = tmp[0];
		majorCount = 0;
		for (int i = 0; i < tmp.length; i++) {
			if (tmpCount[i] > majorCount) {
				majorCount = tmpCount[i];
				majority = tmp[i];
			}
		}
		return majority;
	}
}

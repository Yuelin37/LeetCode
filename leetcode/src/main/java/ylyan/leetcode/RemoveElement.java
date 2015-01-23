/**
 * 27. Remove Element - https://oj.leetcode.com/problems/remove-element/
 * Given an array and a value, remove all instances of that value in place and
 * return the new length. The order of elements can be changed. It doesn't
 * matter what you leave beyond the new length.
 */

package ylyan.leetcode;

import java.util.Arrays;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class RemoveElement {
	Logger logger = Logger.getLogger("ylyan.leetcode");
	{
		PropertyConfigurator.configure("log.conf");
	}

	public static void main(String[] args) {

	}

	public int removeElement(int[] A, int elem) {
		// return (method1Pass(A, elem));
		return (method2Pass(A, elem));
	}

	// Runtime: 187 ms on leetcode
	int method1Pass(int[] A, int elem) {
		// long startTime = System.currentTimeMillis();
		long startTime = System.nanoTime();

		if (A.length == 0)
			return 0;
		int count = 0;
		Arrays.sort(A);
		int max = A[A.length - 1] + 1;
		int pos = Arrays.binarySearch(A, elem);
		while (pos >= 0) {
			A[pos] = max;
			count++;
			Arrays.sort(A);
			pos = Arrays.binarySearch(A, elem);
		}
		Arrays.sort(A);
		// logger.debug(pos);
		// logger.debug("return value: " + (A.length - count));
		// long estimatedTime = System.currentTimeMillis() - startTime;
		long estimatedTime = System.nanoTime() - startTime;
		logger.debug("estimatedTime: " + estimatedTime);
		return A.length - count;
	}

	// Runtime: 226 ms on leetcode
	int method2Pass(int[] A, int elem) {
		// long startTime = System.currentTimeMillis();
		long startTime = System.nanoTime();

		if (A.length == 0)
			return 0;
		int count = 0;
		Arrays.sort(A);
		int max = A[A.length - 1];
		for (int i = 0; i < A.length; i++) {
			if (A[i] == elem) {
				A[i] = max;
				count++;
			}
		}
		Arrays.sort(A);
		// long estimatedTime = System.currentTimeMillis() - startTime;
		long estimatedTime = System.nanoTime() - startTime;
		logger.debug("estimatedTime: " + estimatedTime);
		return A.length - count;
	}
}

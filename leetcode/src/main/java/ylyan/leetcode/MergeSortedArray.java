/**
 * @author Yuelin
 * 88. Merge Sorted Array
 * 
 * Given two sorted integer arrays A and B, merge B into A as one sorted array.
 * Note:
 * You may assume that A has enough space 
 * (size that is greater or equal to m + n) to hold 
 * additional elements from B. 
 * The number of elements initialized 
 * in A and B are m and n respectively.
 */

package ylyan.leetcode;

import java.util.Arrays;

public class MergeSortedArray {
	public void merge(int A[], int m, int B[], int n) {

		// method1Pass(A,m,B,n);
		// method2(A, m, B, n);
		// method4(A, m, B, n);
//		fromLeetCode(A, m, B, n);
		myBest(A, m, B, n);

	}

	private void method1Pass(int A[], int m, int B[], int n) {
		for (int i = 0; i < n; i++) {
			A[m + i] = B[i];
		}
		Arrays.parallelSort(A);
	}

	private void method2(int A[], int m, int B[], int n) {
		if (m == 0) {
			for (int i = 0; i < n; i++) {
				A[i] = B[i];
			}
			return;
		}
		int[] C = new int[m + n];
		int ia = 0;
		int ib = 0;
		for (int i = 0; i < n + m; i++) {
			if (ia == m && ib < n) {
				while (ib < n) {
					C[i] = B[ib];
					ib++;
					i++;
				}
				break;
			}
			if (ib == n && ia < m) {
				while (ia < m) {
					C[i] = A[ia];
					ia++;
					i++;
				}
				break;
			}
			if (A[ia] < B[ib]) {
				C[i] = A[ia];
				ia++;
				continue;
			}
			if (A[ia] > B[ib]) {
				C[i] = B[ib];
				ib++;
				continue;
			}
			if (A[ia] == B[ib]) {
				C[i] = A[ia];
				ia++;
				i++;
				C[i] = B[ib];
				ib++;
				// continue;
			}

		}
		for (int i = 0; i < n + m; i++) {
			A[i] = C[i];
		}
	}

	private void myBest(int A[], int m, int B[], int n) {

		int last = m + n - 1;
		int ia = m - 1;
		for (int ib = n - 1; ib >= 0; ib--) {
			while (ia >= 0 && B[ib] <= A[ia]) {
				A[last--] = A[ia--];
			}
			A[last--] = B[ib];
		}

	}

	private void method4(int A[], int m, int B[], int n) {
		if (m == 0) {
			for (int i = 0; i < n; i++) {
				A[i] = B[i];
			}
			return;
		}
		int cur = 0;
		int moved = 0;
		for (int ib = 0; ib <= n - 1; ib++) {
			for (int ia = cur; ia <= m - 1 + moved; ia++) {
				if (B[ib] < A[ia]) {
					for (int i = 0; i < m + moved - ia; i++) {
						A[m + moved - i] = A[m + moved - i - 1];
					}
					A[ia] = B[ib];
					moved++;
					cur = ia + 1;

					break;
				}

				if (B[ib] >= A[ia] && ia == m - 1 + moved) {
					int leftB = n - moved;
					for (int i = 0; i < leftB; i++) {
						A[ia + i + 1] = B[ib + i];
						cur = ia + 1;
						moved++;
					}
					return;
				}
			}
		}
	}

	private void fromLeetCode(int A[], int m, int B[], int n) {
		int j = m - 1;
		int k = n - 1;
		for (int i = n + m - 1; i > -1; i--) {
			if (k < 0)
				break;
			if (j < 0) {
				A[i] = B[k];
				k--;
			} else if (A[j] > B[k]) {
				A[i] = A[j];
				j--;
			} else {
				A[i] = B[k];
				k--;
			}

		}
	}
}
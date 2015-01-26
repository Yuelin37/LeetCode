package ylyan.leetcode;

import java.util.Arrays;

public class MergeSortedArrayTest extends BaseTestCase {

	private MergeSortedArray msa;

	protected void setUp() {
		super.setUp();
		msa = new MergeSortedArray();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
//		logger.debug("haha");
	}

	public void testMerge() {
		int m = 3;
		int n = 4;
		int[] A = new int[m + n];
		int[] B = new int[n];

		A[0] = 1;
		A[1] = 3;
		A[2] = 5;
		B[0] = 2;
		B[1] = 4;
		B[2] = 6;
		B[3] = 7;

		msa.merge(A, m, B, n);
		assertTrue(Arrays.equals(A, new int[] { 1, 2, 3, 4, 5, 6,7 }));
	}

	public void testEmptyA() {
		int m = 0;
		int n = 1;
		int[] A = new int[m + n];
		int[] B = new int[n];

		B[0] = 1;

		msa.merge(A, m, B, n);
		assertTrue(Arrays.equals(A, new int[] { 1 }));
	}

	public void testMerge1() {
		int m = 3;
		int n = 3;
		int[] A = new int[m + n];
		int[] B = new int[n];
		A[0] = 1;
		A[1] = 2;
		A[2] = 4;
		B[0] = 3;
		B[1] = 5;
		B[2] = 6;

		msa.merge(A, m, B, n);
		assertTrue(Arrays.equals(A, new int[] { 1, 2, 3, 4, 5, 6 }));
	}

	public void testMerge2() {
		int m = 1;
		int n = 1;
		int[] A = new int[m + n];
		int[] B = new int[n];

		A[0] = 1;
		B[0] = 2;

		msa.merge(A, m, B, n);
		assertTrue(Arrays.equals(A, new int[] { 1, 2 }));
	}

	public void testMerge3() {
		int m = 3;
		int n = 3;
		int[] A = new int[m + n];
		int[] B = new int[n];
		A[0] = 4;
		A[1] = 5;
		A[2] = 6;
		B[0] = 1;
		B[1] = 2;
		B[2] = 3;

		msa.merge(A, m, B, n);
		assertTrue(Arrays.equals(A, new int[] { 1, 2, 3, 4, 5, 6 }));
	}

	public void testMerge4() {
		int m = 3;
		int n = 3;
		int[] A = new int[m + n];
		int[] B = new int[n];
		A[0] = 1;
		A[1] = 2;
		A[2] = 3;
		B[0] = 4;
		B[1] = 5;
		B[2] = 6;

		msa.merge(A, m, B, n);
		assertTrue(Arrays.equals(A, new int[] { 1, 2, 3, 4, 5, 6 }));
	}

}

package ylyan.leetcode;

import java.util.Arrays;

import junit.framework.TestCase;

public class MergeSortedArrayTest extends TestCase {

	private MergeSortedArray msa;

	protected void setUp() throws Exception {
		super.setUp();
		msa = new MergeSortedArray();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	 public void testMerge() {
	 int m = 3;
	 int n = 4;
	 int[] A = new int[m+n];
	 int[] B = new int[n];
	
	 A[0] = 1;
	 A[1] = 3;
	 A[2] = 5;
	 B[0] = 2;
	 B[1] = 4;
	 B[2] = 6;
	 B[3] = 7;
	
	 msa.merge(A, m, B, n);
	 System.out.println("----------------" + Arrays.toString(A));
	 }
	//
	 public void testEmptyA() {
	 int m = 0;
	 int n = 1;
	 int[] A = new int[m+n];
	 int[] B = new int[n];
	
	 B[0] = 1;
	
	 msa.merge(A, m, B, n);
	 System.out.println("----------------" + Arrays.toString(A));
	 }
	
	 public void testMerge1() {
	 int m = 3;
	 int n = 3;
	 int[] A = new int[m+n];
	 int[] B = new int[n];
	 A[0] = 1;
	 A[1] = 2;
	 A[2] = 4;
	 B[0] = 3;
	 B[1] = 5;
	 B[2] = 6;
	
	 msa.merge(A, m, B, n);
	 System.out.println("----------------" + Arrays.toString(A));
	 }
	//
	 public void testMerge2() {
	 int m = 1;
	 int n = 1;
	 int[] A = new int[m+n];
	 int[] B = new int[n];
	
	 A[0] = 1;
	 B[0] = 2;
	
	 msa.merge(A, m, B, n);
	 System.out.println("----------------" + Arrays.toString(A));
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
		System.out.println("----------------" + Arrays.toString(A));
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
		System.out.println("----------------" + Arrays.toString(A));
	}

}

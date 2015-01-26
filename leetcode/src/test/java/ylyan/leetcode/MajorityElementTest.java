package ylyan.leetcode;

import junit.framework.TestCase;

public class MajorityElementTest extends BaseTestCase {
	private MajorityElement me;

	protected void setUp() throws Exception {
		super.setUp();
		me = new MajorityElement();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testME() {
//		int[] A = new int[] { 1, 3, 2, 5, 7, 2, 3, 2, 8, 2, 2, 2, 9, 2,0,0};
		int[] A = new int[] { 1,2,2,2,2,3,};
		logger.debug(me.majorityElement(A));
	}
}

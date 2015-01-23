package ylyan.leetcode;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


import junit.framework.TestCase;

public class RemoveElementTest extends TestCase {
	private RemoveElement re;

	Logger logger = Logger.getLogger("ylyan.leetcode");
	{
		PropertyConfigurator.configure("log.conf");
	}

	protected void setUp() throws Exception {
		super.setUp();
		re = new RemoveElement();
	}

	public void testRemoveElement() {

		int[] A = { 7, 12, 1, 2, 3, 4, 5, 5, 5, 33, 3 };
		int elem = 5;
		assertEquals(8, re.removeElement(A, elem));
	}

	public void testEmptyArray() {
		int[] A = {};
		int elem = 5;
		assertEquals(0, re.removeElement(A, elem));
	}
	
	public void testOneElementArray() {
		int[] A = { 1 };
		int elem = 1;
		assertEquals(0, re.removeElement(A, elem));
	}
}

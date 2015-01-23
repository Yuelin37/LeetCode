package ylyan.leetcode;

import junit.framework.TestCase;

public class ExcelSheetColumnNumberTest extends TestCase {

	private ExcelSheetColumnNumber escn;
	protected void setUp() throws Exception {
		super.setUp();
		escn = new ExcelSheetColumnNumber();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testA(){
		assertEquals(1,escn.titleToNumber("A"));
		assertEquals(2,escn.titleToNumber("B"));
		assertEquals(27,escn.titleToNumber("AA"));
		assertEquals(28,escn.titleToNumber("AB"));
	}

}

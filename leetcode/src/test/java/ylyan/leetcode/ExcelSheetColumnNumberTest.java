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
		assertEquals(0,escn.titleToNumber("ABCZ"));
	}

}

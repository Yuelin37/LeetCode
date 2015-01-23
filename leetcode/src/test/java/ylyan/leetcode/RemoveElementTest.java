package ylyan.leetcode;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import junit.framework.TestCase;

public class RemoveElementTest extends TestCase {

	Logger logger = Logger.getLogger("ylyan.leetcode");
	{
		PropertyConfigurator.configure("log.conf");

	}
	public void testRemoveElement() {
		
		RemoveElement re = new RemoveElement();
		int[] A = { 7,12,1, 2, 3, 4, 5, 5, 5, 33, 3 };
		int elem = 5;
		assertEquals(8, re.removeElement(A, elem));
	}
	
	public void testEmptyArray(){
		RemoveElement re = new RemoveElement();
		int[] A={};
		int elem = 5;
		assertEquals(0, re.removeElement(A, elem));
	}

	public void testOneElementArray(){
		RemoveElement re = new RemoveElement();
		int[] A={1};
		int elem = 1;
		assertEquals(0, re.removeElement(A, elem));
	}
}

package ylyan.leetcode;

import junit.framework.TestCase;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public abstract class BaseTestCase extends TestCase {
	protected Logger logger = Logger.getLogger("ylyan.leetcode");

	protected void setUp() throws Exception {
		PropertyConfigurator.configure("log.conf");
	}

	public BaseTestCase() {
	}

}

package text;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import junit.framework.JUnit4TestAdapter;
import junit.framework.Test;
import junit.framework.TestSuite;

@RunWith(Suite.class)
@SuiteClasses({Creat_textTest.class, Cmp_textTest.class, rad_textTest.class})
public class AllTests {
	public static Test suite() {
		TestSuite suite = new TestSuite("All JUnit test");
		suite.addTest(new JUnit4TestAdapter(Creat_text.class));
		suite.addTest(new JUnit4TestAdapter(Cmp_text.class));
		suite.addTest(new JUnit4TestAdapter(rad_text.class));
		return suite;
	}
}
